package org.p99.ninetynineprobs

import org.scalatest._

class P05Spec extends UnitSpec {

  "reverse" should "return an empty list on an empty list" in {
    val myList = List()
    assert(P05.reverse(myList) == List())
  }

  it should "return the same list if it has only one element" in {
    val myList = List(2)
    assert(P05.reverse(myList) == myList)
  }

  it should "reverse lists" in {
    assert(P05.reverse(List(1, 2)) == List(2, 1))
    assert(P05.reverse(List(1, 2, 5)) == List(5, 2, 1))
    assert(P05.reverse(List(4, 1, 2, 5)) == List(5, 2, 1, 4))
    assert(P05.reverse(List(1, 1, 1, 1)) == List(1, 1, 1, 1))
  }

  it should "work on String lists as well" in {
    val myList = List("a", "b", "c")
    assert(P05.reverse(myList) == List("c", "b", "a"))
  }

}
