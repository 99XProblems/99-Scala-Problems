package org.p99.ninetynineprobs

class P31Int(val value : Int) {
  def isPrime() : Boolean = {
    if (value < 1)
      return false

    def hasNoDividerBeside1(n : Int) : Boolean =
      n <= 1 || (value%n != 0 && hasNoDividerBeside1(n - 1))

    hasNoDividerBeside1(Math.sqrt(value).toInt)
  }
}

object P31 {
  implicit def int2P31Int(i : Int) : P31Int =
    new P31Int(i);

  // TODO

}
