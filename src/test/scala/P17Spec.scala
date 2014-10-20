package org.p99.ninetynineprobs

import org.scalatest._

class P17Spec extends UnitSpec {

  "split" should "return two empty lists if called on an empty list" in {
    assert(P17.split(0, List()) == (List(), List()))
  }

  it should "return an empty list on the left if N=0" in {
    val myList = List(1, 2, 5, 3)
    assert(P17.split(0, myList) == (List(), myList))
  }

  it should "return an empty list on the right if N=(list.length)" in {
    val myList = List(1, 2, 5, 3)
    assert(P17.split(myList.length, myList) == (myList, List()))
  }

  it should "split in 2 parts of the same length if N=(list.length/2)" in {
    assert(P17.split(3, List(1, 2, 3, 4, 4, 5)) ==
      (List(1, 2, 3), List(4, 4, 5)))
  }

  it should "work with String lists as well" in {
    assert(P17.split(2, List("a", "bc", "d")) == (List("a", "bc"), List("d")))
  }
}

