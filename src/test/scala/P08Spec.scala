package org.p99.ninetynineprobs

import org.scalatest._

class P08Spec extends UnitSpec {

  "compress" should "return an empty list on an empty list" in {
    assert(P08.compress(List()) == List())
  }

  it should "return a one-element list on a one-element list" in {
    val myList = List(3)
    assert(P08.compress(myList) == myList)
  }

  it should "return a one-element list if all elements of a list are the same" in {
    val myList = List(3, 3, 3, 3, 3, 3, 3, 3, 3)
    assert(P08.compress(myList) == List(3))
  }

  it should "only remove successive duplicates" in {
    val myList = List(1, 2, 2, 2, 3, 3, 2, 2, 3, 3)
    assert(P08.compress(myList) == List(1, 2, 3, 2, 3))
  }

  it should "work with String lists as well" in {
    val myList = List("foo", "bar", "bar", "bar", "qux", "qux", "foo")
    assert(P08.compress(myList) == List("foo", "bar", "qux", "foo"))
  }
}
