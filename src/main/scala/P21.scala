package org.p99.ninetynineprobs

object P21 {

  private def insertAtAcc[T](el : T, idx : Int, ls : List[T], acc : List[T])
  : List[T] = (idx, ls) match {
    case (0, _) => P05.reverse(acc) ::: (el :: ls)
    case (_, head :: tail) => insertAtAcc(el, idx-1, tail, head :: acc)
    case _ => throw new IndexOutOfBoundsException()
  }

  /**
   * Insert an element at a given position into a list.
   **/
  def insertAt[T](el : T, idx : Int, ls : List[T]) : List[T] =
    insertAtAcc(el, idx, ls, Nil)

}
