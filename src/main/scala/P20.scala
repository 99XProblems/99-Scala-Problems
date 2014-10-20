package org.p99.ninetynineprobs

import java.util.NoSuchElementException

object P20 {

  private def removeAtAcc[T](idx : Int, ls : List[T], acc : List[T])
  : (List[T], T) = (idx, ls) match {
    case (0, head :: tail) => (P05.reverse(acc) ::: tail, head)
    case (_, head :: tail) => removeAtAcc(idx-1, tail, head :: acc)
    case _ => throw new NoSuchElementException()
  }

  /**
   * Remove the Kth element from a list.
   * Return the list and the removed element in a Tuple. Elements are numbered
   * from 0.
   **/
  def removeAt[T](idx : Int, ls : List[T]) =
    removeAtAcc(idx, ls, Nil)

}
