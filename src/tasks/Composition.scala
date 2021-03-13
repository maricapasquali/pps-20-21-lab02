package tasks

object Composition {

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  //constraint : type output of 'g' = type input of 'f'
  def gCompose[A, B, C](f: B => C, g: A => B): A => C = x => f(g(x))

}
