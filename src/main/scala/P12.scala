package org.p99.ninetynineprobs

object P12 {

  private def timesAcc[T](count : Int, el : T, acc : List[T]) : List[T] =
    if (count <= 0)
      acc
    else
      timesAcc(count - 1, el, el :: acc)

  private def times[T](count : Int, el : T) : List[T] = timesAcc(count, el, Nil)

  private def decodeAcc[T](ls : P10.t[T], acc : List[T]) : List[T] = ls match {
    case Nil => acc
    case (c, e) :: tail => decodeAcc(tail, times(c, e) ::: acc)
  }

  /**
   * Given a run-length code list generated as specified in problem P10,
   * construct its uncompressed version.
   **/
  def decode[T](ls : P10.t[T]) : List[T] = P05.reverse(decodeAcc(ls, Nil))

}
