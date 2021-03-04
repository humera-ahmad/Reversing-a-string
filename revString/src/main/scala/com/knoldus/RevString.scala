package com.knoldus

import scala.annotation.tailrec

class RevString {

  def reversing(str: String): String = {
    // applying tail recursion for reversing the string
    @tailrec
    def reverse(str: String, rem: String): String = {

      str match {
        case "" => rem //return rem
        case string => reverse(string.tail, string.head + rem) //recursively call reverse method until whole string is reversed
      }
    }
    reverse(str,"")
  }
}