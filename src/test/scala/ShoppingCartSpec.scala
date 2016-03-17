package com.jm2dev.hmrc

import org.specs2.Specification

class ShoppingCartSpec extends Specification { def is = s2"""
  Shopping cart input should
    start with 'Apple'                            $e1
    start with 'Orange'                           $e2
    be a comma separed list of apples and oranges $e3
    not contain a different fruit like a 'Pear'   $e4
  """

  def e1 = new ShoppingCart("Apple").isValid() must be equalTo(true)
  def e2 = new ShoppingCart("Orange").isValid() must be equalTo(true)
  def e3 = new ShoppingCart("Apple,Orange").isValid() must be equalTo(true)
  def e4 = new ShoppingCart("Apple,Orange,Pear").isValid() must be equalTo(false)
}
