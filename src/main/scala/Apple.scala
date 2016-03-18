package com.jm2dev.hmrc

case class Apple(quantity: Int) {
  private val price = 0.6

  def cost() = "£%.2f" format (quantity * price)
}
