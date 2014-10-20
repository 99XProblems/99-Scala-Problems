package org.p99.ninetynineprobs

import org.scalatest._

class P03Spec extends UnitSpec {

  "nth" should "throw NoSuchElementException on an empty list with K=0" in {
    val myList = List()
    intercept[NoSuchElementException] {
      P03.nth(0, myList)
    }
  }

  it should "throw NoSuchElementException on an empty list with K<0" in {
    val myList = List()
    intercept[NoSuchElementException] {
      P03.nth(-1, myList)
    }
    intercept[NoSuchElementException] {
      P03.nth(-26, myList)
    }
  }

  it should "throw NoSuchElementException on an empty list with K>0" in {
    val myList = List()
    intercept[NoSuchElementException] {
      P03.nth(1, myList)
    }
    intercept[NoSuchElementException] {
      P03.nth(123, myList)
    }
  }

  it should "throw NoSuchElementException on a non-empty list with K<0" in {
    val myList = List(1, 2, 3, 4)
    intercept[NoSuchElementException] {
      P03.nth(-1, myList)
    }
    intercept[NoSuchElementException] {
      P03.nth(-17, myList)
    }
  }

  it should "throw NoSuchElementException if K>(list's length)" in {
    val myList = List(3, 4)
    intercept[NoSuchElementException] {
      P03.nth(2, myList)
    }
  }

  it should "return the first element of a list with K=0" in {
    val myList = List(4, 2, 1)
    assert(P03.nth(0, myList) == 4)
  }

  it should "return the Kth element of a list with 0<=K<(list's length)" in {
    val myList = List(4, 2, 1)
    assert(P03.nth(1, myList) == 2)
    assert(P03.nth(2, myList) == 1)
  }

  it should "work with Strings as well" in {
    val myList = List("foo", "bar", "qux")
    assert(P03.nth(0, myList) == "foo")
    assert(P03.nth(1, myList) == "bar")
    assert(P03.nth(2, myList) == "qux")
  }
}
