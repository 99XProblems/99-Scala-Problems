package org.p99.ninetynineprobs

import org.scalatest._

class P13Spec extends UnitSpec {  // adapted from P10Spec

  "encode" should "leave an empty list unchanged" in {
    assert(P13.encodeDirect(List()) == List())
  }

  it should "count unique elements as '1'" in {
    assert(P13.encodeDirect(List(1, 2, 3)) == List((1, 1), (1, 2), (1, 3)))
  }

  it should "count consecutive duplicates" in {
    assert(P13.encodeDirect(List(1, 1, 2, 3, 3, 2, 1, 1, 1)) ==
      List((2, 1), (1, 2), (2, 3), (1, 2), (3, 1)))
  }

  it should "work with String lists as well" in {
    assert(P13.encodeDirect(List("foo", "foo", "bar")) ==
      List((2, "foo"), (1, "bar")))
  }
}

