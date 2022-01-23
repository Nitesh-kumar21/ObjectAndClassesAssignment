package com.knoldus

case class Integer(value: Nat, sign: Sign = Positive) extends Nat with Sign {

  def isZero: Boolean = value.isZero

  def predecessor: Nat =
    if (isZero) new Integer(value.successor, Negative)
    else if (sign.isPositive) new Integer(value.predecessor, sign)
    else new Integer(value.successor, Negative)

  def successor: Nat =
    if (isZero) new Integer(value.successor, Positive)
    else if (sign.isPositive) new Integer(value.successor, sign)
    else new Integer(value.predecessor, Negative)

  def +(that: Nat): Nat =
    if (isZero) that
    else if (sign.isPositive) this.predecessor + that.successor
    else this.successor + that.predecessor

  def -(that: Nat): Nat =
    if (that.isZero) this
    else that match {
      case Integer(v, s) => this + new Integer(v, s.negate)
    }

  def isPositive: Boolean = sign.isPositive

  def negate: Integer = new Integer(value, sign.negate)
}
