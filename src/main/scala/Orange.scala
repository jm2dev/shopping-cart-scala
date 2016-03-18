package com.jm2dev.hmrc

case class Orange(quantity: Int) {
  private val price = 0.25

  def cost() = "£%.2f" format (quantity * price)
}
