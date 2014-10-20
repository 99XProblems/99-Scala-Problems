package org.p99.ninetynineprobs

object P14 {

  private def revDuplicateAcc[T](ls : List[T], acc : List[T]) : List[T] =
    ls match {
      case Nil => acc
      case h :: tail => revDuplicateAcc(tail, h :: h :: acc)
    }

  /**
   * Duplicate the elements of a list
   **/
  def duplicate[T](ls : List[T]) : List[T] =
    P05.reverse(revDuplicateAcc(ls, Nil))

}
