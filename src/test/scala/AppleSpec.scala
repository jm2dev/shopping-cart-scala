package com.jm2dev.hmrc

import org.specs2.Specification

class AppleSpec extends Specification {
  def is =
    s2"""
      Cost
        an apple costs '£0.60'  $e1
        two apples cost '£1.20' $e2
  """

  def e1 = Apple(1).cost() should be equalTo("£0.60")
  def e2 = Apple(2).cost() should be equalTo("£1.20")
}
