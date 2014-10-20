package org.p99.ninetynineprobs

import org.scalatest._

class P02Spec extends UnitSpec {

  "penultimate" should "throw NoSuchElementException on an empty list" in {
    val myList = List()
    intercept[NoSuchElementException] {
      P02.penultimate(myList)
    }
  }

  it should "throw NoSuchElementException on a one-element list" in {
    val myList = List(12)
    intercept[NoSuchElementException] {
      P02.penultimate(myList)
    }
  }

  it should "return the first element of a 2-elements list" in {
    val myList = List(42, 17)
    assert(P02.penultimate(myList) == 42)
  }

  it should "return the last but one element of a >2-elements list" in {
    val myList = List(1, 2, 3, 4, 5)
    assert(P02.penultimate(myList) == 4)
  }

  it should "work on String lists as well" in {
    val myList = List("foo", "bar", "qux")
    assert(P02.penultimate(myList) == "bar")
  }
}
