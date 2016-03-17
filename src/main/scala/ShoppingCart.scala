package com.jm2dev.hmrc

class ShoppingCart(input: String) {
  private val regex = "^[(Apple|Orange),]*(Apple|Orange)$"

  def isValid() = input.matches(regex)

  def total() = input.split(",")
    .map((fruit:String) => cost(fruit))
    .foldLeft(0.0)((x: Double, y:Double) => x + y)

  private def cost(fruit: String) = fruit match {
    case "Apple" => 0.60
    case _ => 0.25
  }
}
