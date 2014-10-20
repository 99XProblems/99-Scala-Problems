package org.p99.ninetynineprobs

import org.scalatest._

class P22Spec extends UnitSpec {

  "range" should "return an empty list when called with start<end" in {
    assert(P22.range(1, 0) == List())
    assert(P22.range(1000, 42) == List())
    assert(P22.range(1, -20) == List())
  }

  it should "return a one-element list if start=end" in {
    assert(P22.range(3, 3).length == 1)
    assert(P22.range(-12, -12).length == 1)
  }

  it should "include both start and end" in {
    assert(P22.range(3, 4) == List(3, 4))
    assert(P22.range(-42, -41) == List(-42, -41))
  }

  it should "return a list of length (end-start+1)" in {
    assert(P22.range(4, 23).length == (23 - 4 + 1))
    assert(P22.range(-24, 2).length == (2 + 24 + 1))
  }
}

