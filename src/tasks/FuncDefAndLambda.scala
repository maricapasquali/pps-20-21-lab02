package tasks


object FuncDefAndLambda {

  // 3.a
  def parity(x: Int): String = x match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  val parityLambda: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  // 3.b
  def neg(predicate: String => Boolean): String => Boolean = s => !predicate(s)

  val negLambda: (String => Boolean) => (String => Boolean) = predicate => (s => !predicate(s))

  // 3.c
  def gNeg[A](predicate: A => Boolean): A => Boolean = s => !predicate(s)

}
