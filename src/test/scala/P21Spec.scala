package org.p99.ninetynineprobs

import org.scalatest._

class P21Spec extends UnitSpec {

  "insertAt" should "return a list with 1 element w/ an empty one and N=0" in {
    assert(P21.insertAt(42, 0, List()) == List(42))
  }

  it should "add an element at the end if N=list.length" in {
    assert(P21.insertAt(42, 3, List(1, 2, 3)) == List(1, 2, 3, 42))
  }

  it should "insert an element at index N" in {
    assert(P21.insertAt(17, 2, List(3, 2, 1, 0)) == List(3, 2, 17, 1, 0))
  }

  it should "work with String lists as well" in {
    assert(P21.insertAt(12, 1, List(1, 2, 3)) == List(1, 12, 2, 3))
  }
}

