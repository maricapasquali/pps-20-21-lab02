package tasks

object Currying {

  //currying val
  val p1: Int => (Int => (Int => Boolean)) = x => (y => (z => x <= y && y <= z))

  //no-currying val
  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y <= z

  //currying def
  def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y <= z

  //no-currying def
  def p4(x: Int, y: Int, z: Int): Boolean = x <= y && y <= z
}
