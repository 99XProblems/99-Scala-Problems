package org.p99.ninetynineprobs

import org.scalatest._

class P12Spec extends UnitSpec {

  "decode" should "leave an empty list unchanged" in {
    assert(P12.decode(List()) == List())
  }

  it should "mirror P10's decode" in {
    val myList = List(1, 2, 1, 1, 3, 3, 2, 2, 2, 2, 1, 4, 5, 6, 6)
    assert(P12.decode(P10.encode(myList)) == myList)

  }

  it should "work with String lists as well" in {
    assert(P12.decode(List((2, "foo"), (1, "bar"))) ==
      List("foo", "foo", "bar"))
  }
}

