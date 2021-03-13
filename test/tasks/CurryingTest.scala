package tasks

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import tasks.Currying._

class CurryingTest {

  @Test
  def testNoCurrying(): Unit = {

    assertTrue(p2(1, 2, 3))

    assertFalse(p2(2, 1, 2))

    assertTrue(p4(1, 2, 3))

    assertFalse(p4(2, 1, 2))

  }


  @Test
  def testCurrying(): Unit = {

    assertTrue(p1(1)(2)(3))

    assertFalse(p1(2)(1)(3))

    val partialCurrying: Int => Int => Boolean = p1(1)
    assertTrue(partialCurrying(2)(3))

    val partialCurrying1: Int => Boolean = p1(3)(2)
    assertFalse(partialCurrying1(3))


    assertTrue(p3(1)(2)(3))

    assertFalse(p3(2)(1)(3))

    val partialCurrying3: Int => Int => Boolean = p3(1)
    assertTrue(partialCurrying3(2)(3))

    val partialCurrying3_1: Int => Boolean = p3(3)(2)
    assertFalse(partialCurrying3_1(3))
  }


}
