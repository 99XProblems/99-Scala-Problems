package org.p99.ninetynineprobs

import org.scalatest._
import scala.util.Random

class P24Spec extends UnitSpec {

  "lotto" should "return an empty list if N=0" in {
    assert(P24.lotto(0, 17) == List())
  }

  it should "return a list of length N" in {
    assert(P24.lotto(24, 36).length == 24)
    assert(P24.lotto(3, 1000).length == 3)
  }

  it should "throw a NoSuchElementException if N>M" in {
    intercept[NoSuchElementException] {
      P24.lotto(1, 0)
    }

    intercept[NoSuchElementException] {
      P24.lotto(20, 9)
    }
  }

  it should "return different numbers" in {
    val ret = P24.lotto(17, 20)
    assert(ret.length == 17)
    assert(ret.toSet.size == 17)
  }

  it should "use an RNG to draw numbers" in {
    val seed = 42
    val rng = new Random(seed)
    assert(P24.lotto(1, 30, new Random(seed))(0) == rng.nextInt(30) + 1)
  }
}

