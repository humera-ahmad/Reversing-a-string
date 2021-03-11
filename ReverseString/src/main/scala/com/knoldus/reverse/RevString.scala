package com.knoldus.reverse

import scala.collection.immutable.StringOps

class RevString {
  def reversing(s: StringOps) : StringOps = {
    for(i <- s.length - 1 to 0 by -1) yield s(i)
  }.mkString
}
