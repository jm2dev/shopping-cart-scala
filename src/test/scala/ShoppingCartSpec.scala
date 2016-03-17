package com.jm2dev.hmrc

import org.specs2.Specification

class ShoppingCartSpec extends Specification { def is = s2"""
  Shopping cart input should
    start with 'Apple'                            $e1
    start with 'Orange'                           $e2
    be a comma separed list of apples and oranges $e3
    not contain a different fruit like a 'Pear'   $e4
    cost for an apple is 60p                      $e5
    cost for an orange is 25p                     $e6
    cost for 'Apple,Orange,Apple,Apple' is 2.05   $e7
  """

  def e1 = new ShoppingCart("Apple").isValid() must be equalTo(true)
  def e2 = new ShoppingCart("Orange").isValid() must be equalTo(true)
  def e3 = new ShoppingCart("Apple,Orange").isValid() must be equalTo(true)
  def e4 = new ShoppingCart("Apple,Orange,Pear").isValid() must be equalTo(false)
  def e5 = new ShoppingCart("Apple").total() must be equalTo(0.60)
  def e6 = new ShoppingCart("Orange").total() must be equalTo(0.25)
  def e7 = new ShoppingCart("Apple,Orange,Apple,Apple").total() must be equalTo(2.05)
}
