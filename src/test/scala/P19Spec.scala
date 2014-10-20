package org.p99.ninetynineprobs

import org.scalatest._

class P19Spec extends UnitSpec {

  "rotate" should "return an empty list if called with an empty list" in {
    assert(P19.rotate(0, List()) == List())
    assert(P19.rotate(1, List()) == List())
    assert(P19.rotate(42, List()) == List())
    assert(P19.rotate(-2, List()) == List())
  }

  it should "leave a list unchanged if N=0" in {
    val myList = List(1, 3, 2, 5, 6, 4)
    assert(P19.rotate(0, myList) == myList)
  }

  it should "leave a list unchanged if N=(list.length)" in {
    val myList = List(1, 3, 2, 5, 6, 4)
    assert(P19.rotate(myList.length, myList) == myList)
  }

  it should "leave a list unchanged if (list.length)=0 (positive offset)" in {
    val myList = List(5)
    assert(P19.rotate(1, myList) == myList)
  }

  it should "leave a list unchanged if (list.length)=0 (negative offset)" in {
    val myList = List(5)
    assert(P19.rotate(-1, myList) == myList)
  }

  it should "rotate once to the left if N=1" in {
    assert(P19.rotate(1, List(3, 4, 5)) == List(4, 5, 3))
  }

  it should "rotate once to the right if N=(list.length-1)" in {
    assert(P19.rotate(2, List(3, 4, 5)) == List(5, 3, 4))
  }

  it should "rotate once to the right if N=-1" in {
    assert(P19.rotate(-1, List(3, 4, 5)) == List(5, 3, 4))
  }

  it should "interpret negative offsets as (list.length-offset)" in {
    val myList = List(1, 2, 3, 4, 5, 6, 2, 1, 9, 0, 42, 1)
    val len = myList.length

    assert(P19.rotate(-3, myList) == P19.rotate(len-3, myList))
    assert(P19.rotate(-7, myList) == P19.rotate(len-7, myList))
  }

  it should "rotate multiple times if N>(list.length)" in {
    val myList = List(3, 2, 1, 5, 4)

    assert(P19.rotate(10, myList) == myList)
    assert(P19.rotate(23, myList) == List(5, 4, 3, 2, 1))
  }

  it should "rotate multiple times if N<(-list.length)" in {
    val myList = List(3, 2, 1, 5, 4)

    assert(P19.rotate(-11, myList) == List(4, 3, 2, 1, 5))
  }

}

