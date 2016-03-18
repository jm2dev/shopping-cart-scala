package com.jm2dev.hmrc

class Parser(input: String) {
  private val regex = "^[(Apple|Orange),]*(Apple|Orange)$"

  val isValid = input.matches(regex)

  def extract(): Option[String] = isValid match {
    case true => Some("Apple")
    case false => None
  }
}
