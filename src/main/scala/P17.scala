package org.p99.ninetynineprobs

object P17 {

  type t[T] = (List[T], List[T])

  def revSplitAcc[T](count : Int, ls : List[T], left : List[T]) : t[T] =
    (count, ls) match {
      case (0, _) | (_, Nil) => (left, ls)
      case (_, h :: tail) => revSplitAcc(count - 1, tail, h :: left)
    }

  /**
   * Split a list into two parts.
   * The length of the first part is given. Use a Tuple for your result.
   **/
  def split[T](count : Int, ls : List[T]) : t[T] = {
    val (l, r) = revSplitAcc(count, ls, Nil)
    (P05.reverse(l), r)
  }

}
