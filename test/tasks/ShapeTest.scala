package tasks

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api._
import tasks.Shape._
import scala.math.Pi

class ShapeTest {

  @Test
  def testRectangle(): Unit = {
    val rect: Shape = Rectangle(10, 30)

    assertEquals(80, perimeter(rect))
    assertEquals(300, area(rect))
  }

  @Test
  def testCircle(): Unit = {
    val circle: Shape = Circle(10)

    assertEquals(20 * Pi, perimeter(circle))
    assertEquals(100 * Pi, area(circle))
  }

  @Test
  def testSquare(): Unit = {
    val square: Shape = Square(30)

    assertEquals(120, perimeter(square))
    assertEquals(900, area(square))
  }
}
