package tasks

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import tasks.Composition._

class CompositionTest {

  @Test
  def testComposition(): Unit = {

    val composeF: Int => Int = compose(_ - 1, _ * 2)

    assertEquals(9, composeF(5))
  }

  @Test
  def testGenericComposition(): Unit = {

    val composeF: String => Int = gCompose((c: Int) => c + 1, (a: String) => a.toInt * 3)
    assertEquals(232, composeF("77"))
    try {
      composeF("C4")
      fail()
    } catch {
      case _: NumberFormatException => assert(true)
    }

    val composeF1: Int => Double = gCompose((c: Double) => c + 1.0, (a: Int) => a * 3.0)
    assertEquals(10.0, composeF1(3))

    val composeF2: Int => Int = gCompose((c: Int) => c - 1, (a: Int) => a * 2)
    assertEquals(5, composeF2(3))
  }

}
