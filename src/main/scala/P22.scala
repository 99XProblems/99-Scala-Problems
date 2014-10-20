package org.p99.ninetynineprobs

object P22 {

  private def rangeAcc(start : Int, end : Int, acc : List[Int]) : List[Int] = {
    if (start > end)
      acc
    else
      rangeAcc(start, end - 1, end :: acc)
  }

  /**
   * Create a list containing all integers within a given range.
   **/
  def range(start : Int, end : Int) : List[Int] = rangeAcc(start, end, Nil)

}
