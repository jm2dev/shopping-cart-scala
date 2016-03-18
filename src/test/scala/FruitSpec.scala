package com.jm2dev.hmrc

import org.specs2.Specification

class FruitSpec extends Specification {
  def is =
    s2"""
      Cost is the product of the number of fruits and its price formatted as '£X.YY'
        a price of '£2.00' is correct      $e1
        a price of '2.000' is incorrect   $e2
  """

  def e1 = new Fruit(1, 2).cost().matches("^£[0-9]+.[0-9]{2}$") should be equalTo(true)
  def e2 = "2.000".matches("^£[0-9]+.[0-9]{2}$") should be equalTo(false)
}
