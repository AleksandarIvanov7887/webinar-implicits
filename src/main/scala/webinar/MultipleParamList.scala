package webinar

object MultipleParamList extends App {
  // Multiple groups of arguments
  def foldV1(x: Int, y: Int)(combinator: Combinator[Int, Int]): Int =
    combinator.combine(x, y)

  def foldV2[A, B](x: A, y: A)(combinator: Combinator[A, B]): B =
    combinator.combine(x, y)

  println(foldV2(10, 5)(Combinator.intAddition))

  // Partial application
  def partiallyApplied[B]: Combinator[Int, B] => B = foldV2(10, 5)

  println(partiallyApplied(Combinator.intAddition))
  println(partiallyApplied(Combinator.intDivision))

  // Type inference
  foldV2(1, 2) { case (x, y) => x + y }
  foldV2("new", "string") { case (x, y) => x + y }

  def foldV3[A](x: A, y: A, z: A)(combinator: Combinator[A, A]): A =
    combinator.combine(z, combinator.combine(x, y))
}
