package tasks

import scala.math.Pi

object Shape {

  sealed trait Shape
  case class Rectangle(b: Double, h: Double) extends Shape
  case class Circle(r: Double) extends Shape
  case class Square(l: Double) extends Shape

  def perimeter(shape: Shape): Double = shape match {
    case Rectangle(b, h) => 2 * (b + h)
    case Circle(r) => 2 * Pi * r
    case Square(l) => l * 4
  }

  def area(shape: Shape): Double = shape match {
    case Rectangle(b, h) => b * h
    case Circle(r) => Pi * r * r
    case Square(l) => l * l
  }

}