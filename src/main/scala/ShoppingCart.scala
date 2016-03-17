package com.jm2dev.hmrc

class ShoppingCart(input: String) {
  private val regex = "^[(Apple|Orange),]*(Apple|Orange)$"

  def isValid() = input.matches(regex)
}
