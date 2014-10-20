package org.p99.ninetynineprobs

import org.scalatest._

class P09Spec extends UnitSpec {

  "pack" should "leave an empty list unchanged" in {
    assert(P09.pack(List()) == List())
  }

  it should "add one level of nesting to unique elements" in {
    assert(P09.pack(List(1, 2, 3)) == List(List(1), List(2), List(3)))
  }

  it should "pack successive duplicates" in {
    assert(P09.pack(List(1, 1, 1)) == List(List(1, 1, 1)))
    assert(P09.pack(List(2, 3, 3, 3, 4)) ==
      List(List(2), List(3, 3, 3), List(4)))
  }

  it should "work with String lists, too" in {
    assert(P09.pack(List("foo", "bar", "bar", "qux")) ==
      List(List("foo"), List("bar", "bar"), List("qux")))
  }
}
