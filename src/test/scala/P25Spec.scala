package org.p99.ninetynineprobs

import scala.util.Random
import org.scalatest._

class P25Spec extends UnitSpec {

  // note: all these tests would pass with a function that returns its
  // argument. We can't test more in black-box mode since we can't rely on the
  // way randomPermute use its RNG to draw number (is the first number of the
  // output the first drawn?).

  "randomPermute" should "leave an empty list unchanged" in {
    assert(P25.randomPermute(List()) == List())
  }

  it should "preserve the list's length" in {
    assert(P25.randomPermute(List(1, 2, 3, 10)).length == 4)
  }

  it should "keep the same elements" in {
    val myList = List(1, 4, 2, 9, 7, 7, 3, 0)
    assert(P25.randomPermute(myList).sorted == myList.sorted)
  }

  it should "use an RNG to draw numbers" in {
    val seed = 42
    val myList = List(3, 2, 1, 42, 17, 0, 0)
    assert(P25.randomPermute(myList, new Random(seed)) ==
      P25.randomPermute(myList, new Random(seed)))
  }

  it should "work with String lists as well" in {
    assert(P25.randomPermute(List("foo")) == List("foo"))
  }
}

