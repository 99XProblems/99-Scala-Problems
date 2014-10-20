package org.p99.ninetynineprobs

object P04 {

  private def lengthAcc(ls : List[_], acc : Int) : Int = (ls, acc) match {
    case (Nil, acc) => acc
    case (_ :: tail, acc) => lengthAcc(tail, acc + 1)
  }

  /**
   * Find the number of elements of a list
   **/
  def length(ls : List[_]) : Int = lengthAcc(ls, 0)
}
