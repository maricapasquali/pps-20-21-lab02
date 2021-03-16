package tasks

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import tasks.Optionals._
import u02.Optionals.Option.{None, Some}

class OptionalsTest {

  @Test
  def testFilter(): Unit = {

    val x = Some(5)

    assertEquals(x, filter(x)(_ > 2))

    assertEquals(None(), filter(x)(_ > 8))
  }

  @Test
  def testMap(): Unit = {

    val x = Some(6)

    assertEquals(Some(true), map(x)(_ > 2))

    assertEquals(Some(false), map(x)(_ > 8))

    assertEquals(None(), map(None[Int]())(_ > 2))

    assertEquals(x, map(Some(2))(_ + 4))
  }


  @Test
  def testMap2(): Unit = {
    val x = Some(7)

    val combine: (Int, Int) => Int = (a, b) => a * b

    assertEquals(None(), map2(None(), None())(combine))

    assertEquals(None(), map2(x, None())(combine))

    assertEquals(None(), map2(None(), x)(combine))

    assertEquals(Some(12), map2(Some(6), Some(2))(combine))

    assertEquals(Some(false), map2(Some(true), Some(false))((a, b) => a && b))

    val combine1: (String, String) => String = (a, b) => a concat b

    assertEquals(Some("hello_mario"), map2(Some("hello"), Some("_mario"))(combine1))

    val combine2: (String, Int) => String = (a, b) => a + b

    assertEquals(Some("hello2"), map2(Some("hello"), Some(2))(combine2))

    val combine3: (Some[Int], String) => String = (a, b) => a + b

    assertEquals(Some(x + "hello"), map2(Some(x), Some("hello"))(combine3))

  }

}
