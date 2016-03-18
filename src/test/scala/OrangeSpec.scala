package com.jm2dev.hmrc

import org.specs2.Specification

class OrangeSpec extends Specification {
  def is =
    s2"""
      Cost
        an orange costs '£0.25'  $e1
        two oranges cost '£0.50' $e2
        three oranges cost '£0.50' $e3
  """

  def e1 = new Orange(1).total() should be equalTo("£0.25")
  def e2 = new Orange(2).total() should be equalTo("£0.50")
  def e3 = new Orange(3).total() should be equalTo("£0.50")
}
