package org.p99.ninetynineprobs

import org.scalatest._

class P07Spec extends UnitSpec {

  "flatten" should "return an empty list on an empty list" in {
    assert(P07.flatten(List()) == List())
  }

  it should "not change a list if it's already flattened" in {
    var myList = List(3, 2, 1, 55)
    assert(P07.flatten(myList) == myList)
  }

  it should "return an empty list on a nested empty list" in {
    assert(P07.flatten(List(List(List(List())))) == List())
  }

  it should "return an empty list on multiple nested empty list" in {
    assert(P07.flatten(List(List(List(List(), List())), List())) == List())
  }

  it should "flatten a list" in {
    assert(P07.flatten(List(List(1, 2), 3, List(4, List(5)))) ==
      List(1, 2, 3, 4, 5))
  }

  it should "work on Strings as well" in {
    assert(P07.flatten(List(List(List("foo"), List("bar")), "qux")) ==
      List("foo", "bar", "qux"))
  }
}
