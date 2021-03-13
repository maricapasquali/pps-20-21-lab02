package tasks

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import tasks.FuncDefAndLambda._

class FuncDefAndLambdaTest {

  @Test
  def testParity(): Unit = {

    val even = "even"
    val odd = "odd"

    assertEquals(even, parity(2))
    assertEquals(odd, parity(3))

    assertEquals(even, parityLambda(88))
    assertEquals(odd, parityLambda(5))
  }


  @Test
  def testNeg(): Unit = {

    val empty: String => Boolean = _ == "" // predicate on strings

    val notEmpty = neg(empty) // which type of notEmpty? String => Boolean

    val notEmptyLambda = negLambda(empty)

    assertTrue(notEmpty("foo"))

    assertFalse(notEmpty(""))

    assertTrue(notEmptyLambda("he"))

    assertFalse(notEmptyLambda(""))
  }

  @Test
  def testNegGeneric(): Unit = {

    val zero: Int => Boolean = _ == 0 // predicate on integer

    val notZero = gNeg(zero)

    assertTrue(notZero(2))

    assertFalse(notZero(0))

    val empty: String => Boolean = _ == "" // predicate on string

    val notEmpty = gNeg(empty)

    assertTrue(notEmpty("hello"))

    assertFalse(notEmpty(""))


  }

}