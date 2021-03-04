package com.knoldus

object ReverseString {

  def main(args: Array[String]) {

    println("Enter the string to reverse")
    // take string input from user
    val word = scala.io.StdIn.readLine()
    //create an object
    val revString = new RevString
    //print the result
    println(revString.reversing(word))
  }
}