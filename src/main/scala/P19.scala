package org.p99.ninetynineprobs

object P19 {

  /**
   * Rotate a list N places to the left.
   **/
  def rotate[T](offset : Int, ls : List[T]) : List[T] = {
    val len = P04.length(ls)

    if (len == 0)
      ls
    else {
      val (l, r) = P17.split(((offset % len) + len) % len, ls)
      r ::: l
    }
  }

}
