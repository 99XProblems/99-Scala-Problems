package org.p99.ninetynineprobs

import java.util.NoSuchElementException
import scala.util.Random

object P23 {

  private def randomRemove[T](ls : List[T], rng : Random) : (List[T], T) =
    P20.removeAt(rng.nextInt(P04.length(ls)), ls)

  private def randomSelectAcc[T](count : Int, ls : List[T], rng : Random,
    acc : List[T]) : List[T] = (count, ls) match {
      case (0, _) => acc
      case (_, Nil) => throw new NoSuchElementException()
      case _ => {
        val (ls2, el) = randomRemove(ls, rng)
        randomSelectAcc(count - 1, ls2, rng, el :: acc)
      }
    }

  // used for unit testing
  def randomSelect[T](count : Int, ls : List[T], rng : Random) : List[T] =
    randomSelectAcc(count, ls, rng, Nil)

  /**
   * Extract a given number of randomly selected elements from a list.
   **/
  def randomSelect[T](count : Int, ls : List[T]) : List[T] =
    randomSelect(count, ls, new Random())
}
