package org.p99.ninetynineprobs

object P11 {

  /**
   * Modify the result of problem P10 in such a way that if an element has no
   * duplicates it is simply copied into the result list. Only elements with
   * duplicates are transferred as (N, E) terms.
   **/
  // ugly: we should use a more specific type than just 'Any'. It should be
  // something like 'List[(Int, T)|T]' (doesn't compile)
  def encodeModified[T](ls : List[T]) : List[Either[T, (Int, T)]] =
    P10.myMap(P09.pack(ls), (l : List[T]) => {
      val len = P04.length(l)
      val el = P03.nth(0, l)
      if (len == 1)
        Left(el)
      else
        Right((len, el))
    })
}
