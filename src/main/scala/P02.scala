package org.p99.ninetynineprobs

import java.util.NoSuchElementException

object P02 {

  /**
   * Find the last but one element of a list
   **/
  def penultimate[T](ls : List[T]) : T = ls match {
    case a :: b :: Nil => a
    case head :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException()
  }
}
