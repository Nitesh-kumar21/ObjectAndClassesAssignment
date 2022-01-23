package com.knoldus
trait Sign {
  def isPositive: Boolean
  def negate: Sign
}

object Positive extends Sign {
  def isPositive: Boolean = true
  def negate: Sign = Negative
}

object Negative extends Sign {
  def isPositive: Boolean = false
  def negate: Sign = Positive
}