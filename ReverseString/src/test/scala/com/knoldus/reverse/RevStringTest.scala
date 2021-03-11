package com.knoldus.reverse

import org.scalatest.flatspec.AnyFlatSpec

class RevStringTest extends AnyFlatSpec {
  val revString = new RevString

  "RevString" should "return correct output" in {
    val result = revString.reversing("Humera")
    assertResult("aremuH")(result)
  }

  it should "return nothing" in {
    val result = revString.reversing("")
    assertResult("")(result)
  }
}
