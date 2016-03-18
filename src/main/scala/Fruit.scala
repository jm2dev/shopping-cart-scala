package com.jm2dev.hmrc

class Fruit(quantity: Int, price: Float) {
  val cost = quantity * price

  def total() = "£%.2f" format cost
}
