package org.p99.ninetynineprobs

import org.scalatest._

class P10Spec extends UnitSpec {

  "encode" should "leave an empty list unchanged" in {
    assert(P10.encode(List()) == List())
  }

  it should "count unique elements as '1'" in {
    assert(P10.encode(List(1, 2, 3)) == List((1, 1), (1, 2), (1, 3)))
  }

  it should "count consecutive duplicates" in {
    assert(P10.encode(List(1, 1, 2, 3, 3, 2, 1, 1, 1)) ==
      List((2, 1), (1, 2), (2, 3), (1, 2), (3, 1)))
  }

  it should "work with String lists as well" in {
    assert(P10.encode(List("foo", "foo", "bar")) ==
      List((2, "foo"), (1, "bar")))
  }
}

