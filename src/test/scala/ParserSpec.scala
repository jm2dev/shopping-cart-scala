package com.jm2dev.hmrc

import org.specs2.Specification

class ParserSpec extends Specification {
  def is =
    s2"""
         Input
          should be a comma separated list of 'Apple' or 'Orange' strings     $e1
          shouldn't contain any string different to 'Apple', 'Orange' or ','  $e2
         Parser should return nothing for invalid input     $e3
         Parser should return parsed items for valid input  $e4
  """

  val validInput = "Apple"
  val parserWithValidInput = new Parser(validInput)
  val parsedItems = "Apple"

  val invalidInput = "Apple, Pear"
  val parserWithInvalidInput = new Parser(invalidInput)

  def e1 = parserWithValidInput.isValid should be equalTo(true)
  def e2 = parserWithInvalidInput.isValid should be equalTo(false)
  def e3 = parserWithInvalidInput.extract() should be equalTo(None)
  def e4 = parserWithValidInput.extract() should be equalTo(Some(parsedItems))
}
