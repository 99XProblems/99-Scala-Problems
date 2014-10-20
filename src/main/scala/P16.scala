package org.p99.ninetynineprobs

object P16 {

  def revDropAcc[T](n : Int, idx : Int, ls : List[T], acc : List[T])
  : List[T] = ls match {
    case Nil => acc
    case h :: tail =>
      if (idx%n == 0)
        revDropAcc(n, idx+1, tail, acc)
      else
        revDropAcc(n, idx+1, tail, h :: acc)
  }

  /**
   * Drop every Nth element from a list.
   **/
  def drop[T](n : Int, ls : List[T]) : List[T] =
    P05.reverse(revDropAcc(n, 1, ls, Nil))

}
