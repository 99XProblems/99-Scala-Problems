package org.p99.ninetynineprobs

object P09 {

  private def packAcc[T](ls : List[T], curr : List[T], acc : List[List[T]])
    : List[List[T]] = (ls, curr) match {
      case (Nil, Nil) if acc == Nil => Nil // special case for empty lists
      case (Nil, _) => curr :: acc
      case ((h :: t), Nil) => packAcc(t, List(h), acc)
      case ((a :: t1), (b :: _)) if a == b => packAcc(t1, a :: curr, acc)
      case ((a :: t1), (b :: _)) if a != b => packAcc(t1, List(a), curr :: acc)
    }

  /**
   * Pack consecutive duplicates of list elements into sublists
   **/
  def pack[T](ls : List[T]) : List[List[T]] =
    P05.reverse(packAcc(ls, Nil, Nil))
}
