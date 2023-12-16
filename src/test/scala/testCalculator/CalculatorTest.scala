package testCalculator

import org.scalatest.funsuite.AnyFunSuite

class CalculatorTest extends AnyFunSuite{

  val calculator = new Calculator

  test("Multiply: 0*0, 0*1, 1*0"){
    var a = 0
    var b = 0
    assert(calculator.multiply(a, b) == 0)
    a = 0
    b = 1
    assert(calculator.multiply(a, b) == 0)
    a = 0
    b = -1
    assert(calculator.multiply(a, b) == 0)
  }

  test("Divide: a / 0"){
    val a: Int = 10
    val b: Int = 0
    assertThrows[ArithmeticException](calculator.divide(a, b))
  }

}
