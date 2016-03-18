package com.jm2dev.hmrc

class Orange(quantity: Int) extends Fruit(quantity, 0.25f) {
  override val cost: Float = new Fruit(offeredQuantity(), 0.25f).cost

  private def offeredQuantity() = {
    val groups = Math.floorDiv(quantity, 3)
    Math.floorMod(quantity, 3) match {
      case 0 => groups * 2
      case _ => quantity - (3 * groups) + (groups * 2)
    }
  }
}
