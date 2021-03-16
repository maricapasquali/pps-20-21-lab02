package tasks
import u02.Optionals.Option
import u02.Optionals.Option.{None, Some}

object Optionals {

  def filter[A](opt: Option[A])(predicate: A => Boolean): Option[A] = opt match {
    case Some(x) if predicate(x) => opt
    case _ => None()
  }

  def map[A, B](opt: Option[A])(mapper: A => B): Option[B] = opt match {
    case Some(x) => Some(mapper(x))
    case _ => None()
  }

  def map2[A, B, C](opt1: Option[A], opt2: Option[B])(combine: (A, B) => C): Option[C] = (opt1, opt2) match {
    case (Some(a), Some(b)) => Some(combine(a, b))
    case _ => None()
  }
}
