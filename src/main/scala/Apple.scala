package com.jm2dev.hmrc

class Apple(quantity: Int) extends Fruit(quantity, 0.6f) {
  override val cost: Float = new Fruit(offeredQuantity(), 0.6f).cost

  private def offeredQuantity() = Math.floorMod(quantity, 2) match {
    case 0 => quantity / 2
    case _ => (quantity / 2 + 1)
  }
}
