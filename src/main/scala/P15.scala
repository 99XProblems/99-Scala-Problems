package org.p99.ninetynineprobs

object P15 {

  private def prependN[T](count : Int, el : T, acc : List[T]) : List[T] =
    if (count == 0)
      acc
    else
      prependN(count - 1, el, el :: acc)

  private def revDuplicateNAcc[T](ls : List[T], count : Int, acc : List[T])
  : List[T] = ls match {
      case Nil => acc
      case h :: tail => revDuplicateNAcc(tail, count, prependN(count, h, acc))
    }

  /**
   * Duplicate the elements of a list a given number of times
   **/
  def duplicateN[T](count : Int, ls : List[T]) : List[T] =
    P05.reverse(revDuplicateNAcc(ls, count, Nil))

}
