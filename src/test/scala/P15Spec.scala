package org.p99.ninetynineprobs

import org.scalatest._

class P15Spec extends UnitSpec {

  "duplicateN" should "leave an empty list unchanged" in {
    assert(P15.duplicateN(2, List()) == List())
    assert(P15.duplicateN(49, List()) == List())
  }

  it should "leave a list unchanged with N=1" in {
    val myList = List(1, 5, 3, 2, 3, 1, 3, 45, 1)
    assert(P15.duplicateN(1, myList) == myList) 
  }

  it should "return a list of length Nx the original" in {
    val myList = List(1, 2, 3, 2, 3, 2, 3, 3, 45, 1)
    assert(P15.duplicateN(2, myList).length == 2 * myList.length)
    assert(P15.duplicateN(3, myList).length == 3 * myList.length)
  }

  it should "duplicate each element of the list N times" in {
    assert(P15.duplicateN(2, List(1, 2, 2, 1, 3, 4, 4)) ==
      List(1, 1, 2, 2, 2, 2, 1, 1, 3, 3, 4, 4, 4, 4))
    assert(P15.duplicateN(7, List(1, 2)) ==
      List(1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2))
  }

  it should "work with String lists as well" in {
    assert(P15.duplicateN(3, List("foo", "bar")) ==
      List("foo", "foo", "foo", "bar", "bar", "bar"))
  }
}

