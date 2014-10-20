package org.p99.ninetynineprobs

import scala.util.Random

object P25 {

  // used for unit tests
  def randomPermute[T](ls : List[T], rng : Random) : List[T] =
    P23.randomSelect(P04.length(ls), ls, rng)

  /**
   * Generate a random permutation of the elements of a list.
   **/
  def randomPermute[T](ls : List[T]) : List[T] =
    randomPermute(ls, new Random())

}
