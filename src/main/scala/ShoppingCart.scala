package com.jm2dev.hmrc

class ShoppingCart(input: String) {
  private val regex = "^[(Apple|Orange),]*(Apple|Orange)$"

  def isValid() = input.matches(regex)

  def total() = {
    val result = reducedCost()

    isValid() match {
      case true => "£%.2f" format result
      case false => "ERROR: invalid input."
    }
  }

  def reducedCost() = {
    val apples = groupItem("Apple")
    val oranges = groupItem("Orange")

    reducedCostForApples(apples) + reducedCostForOranges(oranges)
  }

  private def groupItem(item: String) = input.split(",")
    .filter(_.equals(item))
    .length

  private def reducedCostForApples(apples: Int) = Math.floorMod(apples, 2) match {
    case 0 => apples / 2 * 0.60
    case _ => (apples / 2 + 1) * 0.60
  }

  private def reducedCostForOranges(oranges: Int) = {
    val groups = Math.floorDiv(oranges, 3)
    Math.floorMod(oranges, 3) match {
      case 0 => (groups * 2) * 0.25
      case _ => (oranges - (3 * groups) + (groups * 2)) * 0.25
    }
  }

  private def cost(fruit: String) = fruit match {
    case "Apple" => 0.60
    case _ => 0.25
  }
}
