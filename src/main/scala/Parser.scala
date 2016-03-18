package com.jm2dev.hmrc

class Parser(input: String) {
  private val regex = "^[(Apple|Orange),]*(Apple|Orange)$"
  val isValid = input.matches(regex)

  def extract() = isValid match {
    case true => Some(fruits)
    case false => None
  }

  private val items = input.split(",") groupBy identity values

  private val fruits = items.map(item => createFruit(item))

  private def createFruit(items: Array[String]): Fruit = {
    items.head match {
      case "Apple" => new Apple(items.size)
      case _ => new Orange(items.size) //Not apple then must be orange
    }
  }
}
