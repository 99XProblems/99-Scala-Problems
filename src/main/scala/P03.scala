package org.p99.ninetynineprobs

import java.util.NoSuchElementException

object P03 {
  /**
   * Find the Kth element of a list.
   **/
  def nth[T](k : Int, ls : List[T]) : T = (k, ls) match {
    case (0, head :: _) => head
    case (n, _ :: tail) if (n >= 0) => nth(n-1, tail)
    case _ => throw new NoSuchElementException()
  }
}
