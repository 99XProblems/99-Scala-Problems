package org.p99.ninetynineprobs

object P26 {

  /**
   * One-level flatten
   **/
  private def myRevFlatten1[T](ls : List[List[T]]) : List[T] = {
    def myFlattenAcc1[T](ls : List[List[T]], acc : List[T]) : List[T] =
      ls match {
        case Nil => acc
        case l :: tail => myFlattenAcc1(tail, l ::: acc)
      }

    myFlattenAcc1(ls, Nil)
  }

  private def myRevMapRestAcc[A, B](ls : List[A], acc : List[B],
    fn : (A, List[A]) => B) : List[B] = ls match {
      case Nil => acc
      case h :: tail => myRevMapRestAcc(tail, fn(h, tail) :: acc, fn)
  }

  def myRevMapRest[A, B](ls : List[A], fn : (A, List[A]) => B) =
    myRevMapRestAcc(ls, Nil, fn)

  /**
   * Generate the combinations of K distinct objects chosen from the N elements
   * of a list.
   * In how many ways can a committee of 3 be chosen from a group of 12 people?
   * We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the
   * well-known binomial coefficient). For pure mathematicians, this result may
   * be great. But we want to really generate all the possibilities.
   *
   * Note: this is not a tail-recursive function
   **/
  def combinations[T](count : Int, ls : List[T]) : List[List[T]] =
    if (count == 0)
      List(List())
    else {
      myRevFlatten1(
        myRevMapRest(ls, (el : T, tail : List[T]) => {
          val combs = combinations(count - 1, tail)
          P10.myMap(combs, (c : List[T]) => (el :: c))
        })
      )
    }
}
