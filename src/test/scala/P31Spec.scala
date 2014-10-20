package org.p99.ninetynineprobs

import org.scalatest._

class P31Spec extends UnitSpec {

  import P31._

  "isPrime" should "return false for 0" in {
    assert(0.isPrime == false)
  }

  it should "return false for negative numbers" in {
    assert(-2.isPrime == false)
    assert(-1000.isPrime == false)
  }

  it should "return true for 1" in {
    assert(1.isPrime == true)
  }

  it should "return true for prime numbers" in {
    assert(2.isPrime == true)
    assert(3.isPrime == true)
    assert(41.isPrime == true)
  }

  it should "return false for non-prime numbers" in {
    assert(4.isPrime == false)
    assert(981.isPrime == false)
    assert(10000.isPrime == false)
  }
}

