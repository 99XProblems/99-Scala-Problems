package org.p99.ninetynineprobs

object P10 {

  type t[T] = List[(Int, T)]

  private def myRevMapAcc[A, B](ls : List[A], acc : List[B], fn : (A) => B)
    : List[B] = ls match {
      case Nil => acc
      case h :: tail => myRevMapAcc(tail, fn(h) :: acc, fn)
  }

  // let's assume we can't use List#map
  // this is public to be used in P11
  def myMap[A, B](ls : List[A], fn : (A) => B) =
    P05.reverse(myRevMapAcc(ls, Nil, fn))

  /**
   * Use the result of problem P09 to implement the so-called run-length
   * encoding data compression method. Consecutive duplicates of elements are
   * encoded as tuples (N, E) where N is the number of duplicates of the
   * element E.
   **/
  def encode[T](ls : List[T]) : t[T] =
    myMap(P09.pack(ls), (l : List[T]) =>
        (P04.length(l), P03.nth(0, l)))
}
