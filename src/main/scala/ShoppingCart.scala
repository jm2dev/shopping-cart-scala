package com.jm2dev.hmrc

class ShoppingCart(input: String) {
  def total() = {
    val parser = new Parser(input)
    val parsed = parser.extract()
    parsed match {
      case None => "ERROR: invalid input."
      case _ => new Fruit(1, parsed.get.map(_.cost).reduce((x, y) => x + y)).total()
    }
  }
}
