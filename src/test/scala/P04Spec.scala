package org.p99.ninetynineprobs

import org.scalatest._

class P04Spec extends UnitSpec {

  "length" should "return 0 on an empty list" in {
    val myList = List()
    assert(P04.length(myList) == 0)
  }

  it should "return the length of a list" in {
    assert(P04.length(List(3)) == 1)
    assert(P04.length(List(3, 45)) == 2)
    assert(P04.length(List(3, 4, 5)) == 3)
    assert(P04.length(List(3, 45, 15, -2)) == 4)
  }

  it should "work on Strings as well" in {
    val myList = List("foo", "bar")
    assert(P04.length(myList) == 2)
  }
}
