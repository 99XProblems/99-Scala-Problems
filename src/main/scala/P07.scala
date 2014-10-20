package org.p99.ninetynineprobs

object P07 {

  private def flattenAcc[T](source : List[T], target : List[T]) : List[T] = source match {
      case Nil => target
      case (h:List[T @unchecked]) :: tail =>
        flattenAcc(tail, P05.reverse(flatten(h)) ::: target)
      case h :: tail => flattenAcc(tail, h :: target)
    }

  /**
   * Flatten a nested list structure
   **/
  def flatten[T](ls : List[T]) : List[T] = P05.reverse(flattenAcc(ls, Nil))
}
