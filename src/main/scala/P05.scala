package org.p99.ninetynineprobs

object P05 {

  private def reverseAcc[T](source : List[T], target : List[T]) : List[T] =
    (source, target) match {
      case (Nil, t) => t
      case (head :: tail, t) => reverseAcc(tail, head :: t)
    }

  /**
   * Reverse a list
   **/
  def reverse[T](ls : List[T]) : List[T] = reverseAcc(ls, Nil)
}
