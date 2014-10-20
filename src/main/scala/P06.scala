package org.p99.ninetynineprobs

object P06 {

  /**
   * Find out whether a list is a palindrome
   **/
  def isPalindrome(ls : List[_]) : Boolean = {
    ls == P05.reverse(ls)
  }
}
