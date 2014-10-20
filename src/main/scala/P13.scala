package org.p99.ninetynineprobs

import java.util.NoSuchElementException

object P13 {
  // since we're not allowed to reuse code from previous problems, I've
  // copy/pasted (boo!) some parts here

  private def revPackAcc[T](ls : List[T], curr : List[T], acc : List[List[T]])
    : List[List[T]] = (ls, curr) match {
      case (Nil, Nil) if acc == Nil => Nil // special case for empty lists
      case (Nil, _) => curr :: acc
      case ((h :: t), Nil) => revPackAcc(t, List(h), acc)
      case ((a :: t1), (b :: _)) if a == b => revPackAcc(t1, a :: curr, acc)
      case ((a :: t1), (b :: _)) if a != b =>
        revPackAcc(t1, List(a), curr :: acc)
    }

  private def revPack[T](ls : List[T]) : List[List[T]] =
    revPackAcc(ls, Nil, Nil)

  private def myRevMapAcc[A, B](ls : List[A], acc : List[B], fn : (A) => B)
    : List[B] = ls match {
      case Nil => acc
      case h :: tail => myRevMapAcc(tail, fn(h) :: acc, fn)
  }

  private def myRevMap[A, B](ls : List[A], fn : (A) => B) =
    myRevMapAcc(ls, Nil, fn)

  private def first[T](ls : List[T]) : T = ls match {
    case h :: _ => h
    case _ => throw new NoSuchElementException()
  }

  private def lengthAcc(ls : List[_], acc : Int) : Int = ls match {
    case Nil => acc
    case _ :: tail => lengthAcc(tail, acc + 1)
  }

  private def length(ls : List[_]) : Int = lengthAcc(ls, 0)

  /**
   * Implement the so-called run-length encoding data compression method
   * directly. I.e. don't use other methods you've written (like P09's pack);
   * do all the work directly.
   **/
  def encodeDirect[T](ls : List[T]) : List[(Int, T)] =
    myRevMap(revPack(ls), (l : List[T]) =>
        (length(l), first(l)))
}
