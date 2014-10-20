package org.p99.ninetynineprobs

import org.scalatest._

class P18Spec extends UnitSpec {

  "slice" should "return an empty list if start=end" in {
    assert(P18.slice(0, 0, List(1, 2, 3)) == List())
    assert(P18.slice(2, 2, List(1, 2, 3)) == List())
  }

  it should "returne an empty list if called on an empty list" in {
    assert(P18.slice(0, 42, List()) == List())
  }

  it should "return the whole list if start=0, end=(list.length)" in {
    val myList = List(3, 2, 1, 4, 5)
    assert(P18.slice(0, myList.length, myList) == myList)
  }

  it should "return a slice from start (incl.) to end (excl.)" in {
    assert(P18.slice(3, 5, List(3, 2, 1, 2, 3, 4, 1)) ==
      List(2, 3))
    assert(P18.slice(3, 6, List(3, 2, 1, 2, 3, 4, 1)) ==
      List(2, 3, 4))
  }

  it should "work on String lists as well" in {
    assert(P18.slice(2, 5, List("a", "b", "c", "d", "e", "f", "g")) ==
      List("c", "d", "e"))
  }
}

