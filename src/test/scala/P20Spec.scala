package org.p99.ninetynineprobs

import org.scalatest._

class P20Spec extends UnitSpec {

  "removeAt" should "throw a NoSuchElementException on an empty list" in {
    intercept[NoSuchElementException] {
      P20.removeAt(0, List())
    }

    intercept[NoSuchElementException] {
      P20.removeAt(3, List())
    }
  }

  it should "throw a NoSuchElementException on a negative index" in {
    intercept[NoSuchElementException] {
      P20.removeAt(-2, List(1, 2, 3))
    }
  }

  it should "throw a NoSuchElementException with K==(list.length)" in {
    intercept[NoSuchElementException] {
      P20.removeAt(3, List(1, 2, 3))
    }
  }

  it should "throw a NoSuchElementException with K>(list.length)" in {
    intercept[NoSuchElementException] {
      P20.removeAt(10, List(1, 2, 3))
    }
  }

  it should "remove the first element if K=0" in {
    assert(P20.removeAt(0, List(3, 5, 1)) == (List(5, 1), 3))
  }

  it should "remove the last element if K=(list.length-1)" in {
    assert(P20.removeAt(2, List(3, 5, 1)) == (List(3, 5), 1))
  }

  it should "remove the Kth element of the list" in {
    assert(P20.removeAt(2, List(1, 2, 3, 4, 5)) == (List(1, 2, 4, 5), 3))
    assert(P20.removeAt(3, List(1, 2, 3, 4, 5)) == (List(1, 2, 3, 5), 4))
  }

  it should "work on String lists as well" in {
    assert(P20.removeAt(1, List("foo", "bar", "qux")) ==
      (List("foo", "qux"), "bar"))
  }
}

