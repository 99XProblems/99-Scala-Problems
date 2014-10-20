package org.p99.ninetynineprobs

object P18 {

  /**
   * Extract a slice from a list.
   * Given two indices, I and K, the slice is the list containing the elements
   * from and including the Ith element up to but not including the Kth element
   * of the original list. Start counting the elements with 0.
   **/
  def slice[T](start : Int, end : Int, ls : List[T]) : List[T] = {
    val (_, tmp) = P17.split(start, ls)
    val (middle, _) = P17.split(end - start, tmp)
    middle
  }

}
