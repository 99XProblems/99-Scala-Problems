package org.p99.ninetynineprobs

import org.scalatest._

class P16Spec extends UnitSpec {

  "drop" should "leave an empty list unchanged" in {
    assert(P16.drop(1, List()) == List())
    assert(P16.drop(2, List()) == List())
    assert(P16.drop(5, List()) == List())
  }

  it should "return an empty list with N=1" in {
    assert(P16.drop(1, List(1)) == List())
    assert(P16.drop(1, List(1, 2)) == List())
    assert(P16.drop(1, List(1, 2, 3)) == List())
  }

  it should "remove only the last element if N=list.length" in {
    assert(P16.drop(2, List(1, 2)) == List(1))
    assert(P16.drop(3, List(1, 2, 3)) == List(1, 2))
    assert(P16.drop(4, List(1, 2, 3, 4)) == List(1, 2, 3))
  }

  it should "return a list of length (input.length/2) with N=2 (even)" in {
    assert(P16.drop(2, List(1, 2, 3, 4, 5, 6)).length == 3)
  }

  it should "return a list of length (ceil(input.length/2)) with N=2 (odd)" in {
    assert(P16.drop(2, List(1, 2, 3, 4, 5, 6, 7)).length == 4)
  }

  it should "drop every Nth element from a list" in {
    assert(P16.drop(3, List(1, 2, 3, 4, 5)) == List(1, 2, 4, 5))
    assert(P16.drop(3, List(1, 2, 3, 4, 5, 6)) == List(1, 2, 4, 5))
    assert(P16.drop(3, List(1, 2, 3, 4, 5, 6, 7)) == List(1, 2, 4, 5, 7))
  }

  it should "work with String lists as well" in {
    assert(P16.drop(4, List("a", "b", "c", "d", "e", "f")) ==
      List("a", "b", "c", "e", "f"))
  }
}

