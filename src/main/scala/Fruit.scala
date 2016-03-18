package com.jm2dev.hmrc

class Fruit(quantity: Int, price: Float) {
  def cost() = "£%.2f" format (quantity * price)
}
