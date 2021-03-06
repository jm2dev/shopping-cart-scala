package com.jm2dev.hmrc

import org.specs2.Specification

class AppleSpec extends Specification {
  def is =
    s2"""
      Cost
        an apple costs '£0.60'  $e1
        two apples cost '£0.60' $e2
  """

  def e1 = new Apple(1).total() should be equalTo("£0.60")
  def e2 = new Apple(2).total() should be equalTo("£0.60")
}
