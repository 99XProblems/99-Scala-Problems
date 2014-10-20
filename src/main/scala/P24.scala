package org.p99.ninetynineprobs

import java.util.NoSuchElementException
import scala.util.Random

object P24 {

  // used for unit tests
  def lotto(count : Int, max : Int, rng : Random) : List[Int] =
    P23.randomSelect(count, P22.range(1, max), rng)

  /**
   * Lotto: Draw N different random numbers from the set 1..M.
   **/
  def lotto(count : Int, max : Int) : List[Int] =
    lotto(count, max, new Random())

}
