package org.p99.ninetynineprobs

import scala.util.Random
import org.scalatest._

class P23Spec extends UnitSpec {

  "randomSelect" should "return an empty list if N=0" in {
    assert(P23.randomSelect(0, List(2, 3, 1, 4)) == List())
  }

  it should "return a list of length N" in {
    assert(P23.randomSelect(2, List(17, 42, 1)).length == 2)
    assert(P23.randomSelect(3, List(1, -2, 3, 4, 7)).length == 3)
  }

  it should "use an RNG to draw numbers" in {
    val seed = 42
    val myList = List(4, 1, 2, 3)
    assert(P23.randomSelect(1, myList, new Random(seed))(0) ==
      myList(new Random(seed).nextInt(4)))
  }

  it should "work with String lists as well" in {
    assert(P23.randomSelect(1, List(2, 2, 2)) == List(2))
  }
}

