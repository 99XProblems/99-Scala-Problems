package org.p99.ninetynineprobs

import org.scalatest._

class P14Spec extends UnitSpec {

  "duplicate" should "leave an empty list unchanged" in {
    assert(P14.duplicate(List()) == List())
  }

  it should "return a list of length 2x the original" in {
    val myList = List(1, 2, 3, 2, 3, 2, 3, 3, 45, 1)
    assert(P14.duplicate(myList).length == 2 * myList.length)
  }

  it should "duplicate each element of the list" in {
    assert(P14.duplicate(List(1, 2, 2, 1, 3, 4, 4)) ==
      List(1, 1, 2, 2, 2, 2, 1, 1, 3, 3, 4, 4, 4, 4))
  }

  it should "work with String lists as well" in {
    assert(P14.duplicate(List("foo", "bar")) ==
      List("foo", "foo", "bar", "bar"))
  }
}

