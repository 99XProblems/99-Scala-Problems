package org.p99.ninetynineprobs

import org.scalatest._

class P11Spec extends UnitSpec {

  "encodeModified" should "leave an empty list unchanged" in {
    assert(P11.encodeModified(List()) == List())
  }

  it should "leave a list with unique elements only unchanged" in {
    val myList = List(1, 2, 3)
    assert(P11.encodeModified(myList) == List(Left(1), Left(2), Left(3)))
  }

  it should "count consecutive duplicates" in {
    assert(P11.encodeModified(List(1, 1, 3, 3, 1, 1, 1)) ==
      List(Right((2, 1)), Right((2, 3)), Right((3, 1))))
  }

  it should "mix unique and duplicate counts in its returned list" in {
    assert(P11.encodeModified(List(1, 1, 3, 2, 2, 45, 3, 2, 2)) ==
      List(Right((2, 1)), Left(3), Right((2, 2)), Left(45), Left(3),
        Right((2, 2))))
  }

  it should "work with String lists as well" in {
    assert(P11.encodeModified(List("foo", "foo", "bar")) ==
      List(Right((2, "foo")), Left("bar")))
  }
}

