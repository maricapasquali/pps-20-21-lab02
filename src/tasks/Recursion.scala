package tasks

object Recursion {

  // NO RECURSION TAIL
  def fib(n: Int): Int = n match {
    case x if x <= 0 => 0
    case 1 => 1
    case _ => fib(n - 1) + fib(n - 2)
  }

  //RECURSION TAIL
  def fibTail(n: Int): Int = {
    @annotation.tailrec
    def _fibTail(num: Int, prev: Int, next: Int): Int = num match {
      case x if x <= 0 => prev;
      case _ => _fibTail(num - 1, next, prev + next)
    }

    _fibTail(n, 0, 1)
  }

}
