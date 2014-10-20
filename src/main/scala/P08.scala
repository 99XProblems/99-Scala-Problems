package org.p99.ninetynineprobs

object P08 {

  def compressAcc[T](ls : List[T], acc : List[T]) : List[T] = ls match {
    case a :: b :: tail if a == b => compressAcc(a :: tail, acc)
    case h :: tail => compressAcc(tail, h :: acc)
    case Nil => acc
  }

  /**
   * Eliminate consecutive duplicates of list elements
   **/
  def compress[T](ls : List[T]) : List[T] = P05.reverse(compressAcc(ls, Nil))
}
