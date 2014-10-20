package org.p99.ninetynineprobs

import org.scalatest._

class P01Spec extends UnitSpec {

  "last" should "return the head of a list with one element" in {
    val myList = List(42)
    assert(P01.last(myList) == 42)
  }

  it should "throw NoSuchElementException on an empty list" in {
    val myList = List()
    intercept[NoSuchElementException] {
      P01.last(myList)
    }
  }

  it should "return the last element of a list with >1 elements" in {
    val myList = List(1, 2, 3, 4, 5, 123)
    assert(P01.last(myList) == 123)
  }

  it should "work with String lists as well" in {
    val myList = List("foo", "bar")
    assert(P01.last(myList) == "bar")
  }
}
