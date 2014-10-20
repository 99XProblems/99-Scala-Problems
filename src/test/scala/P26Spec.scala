package org.p99.ninetynineprobs

import org.scalatest._

class P26Spec extends UnitSpec {

  "combinations" should "return one empty list when N=0" in {
    assert(P26.combinations(0, List(1, 2, 3)) == List(List()))
  }

  it should "return one list per item when N=1" in {
    val myList = List(3, 2, 1, 5)
    assert(P26.combinations(1, myList) == myList.map((x) => List(x)))
  }

  it should "return lists of length N" in {
    assert(P26.combinations(4, List(1, 2, 3, 5, 4))(0).length == 4)
  }

  it should "return C(list.length, N) lists" in {
    val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    assert(P26.combinations(3, myList).length == 220)
  }

  it should "not remove duplicates" in {
    val myList = List(2, 2, 2)
    assert(P26.combinations(2, myList) ==
      List(List(2, 2), List(2, 2), List(2, 2)))
  }
}

