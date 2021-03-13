package tasks

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api._
import tasks.Recursion._

class RecursionTest {

  private val expected = (0, 1, 1, 2, 3, 5, 8, 13, 21, 34)

  @Test
  def testFibonacciNoTailRecursive(): Unit = {

    assertEquals(
      expected,
      (
        fib(0), fib(1), fib(2), fib(3), fib(4),
        fib(5), fib(6), fib(7), fib(8), fib(9)
      )
    )
  }

  @Test
  def testFibonacciTailRecursive(): Unit = {
    assertEquals(expected,
      (
        fibTail(0), fibTail(1), fibTail(2), fibTail(3), fibTail(4),
        fibTail(5), fibTail(6), fibTail(7), fibTail(8), fibTail(9)
      )
    )
  }

}