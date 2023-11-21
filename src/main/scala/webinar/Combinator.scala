package webinar

object Methods {
  def addition(x: Int, y: Int): Int = x + y

  def division(x: Int, y: Int): Float = x / y

  def stringCombine(x: String, y: String): String = s"$x - $y"

  // Levels of abstraction
  // - type of arguments
  // - return type
  // - operator between argument
}

// A - type of arguments
// B - type of result
trait Combinator[A, B] {
  def combine(x: A, y: A): B
}

object Combinator {
  val intAddition = new Combinator[Int, Int] {
    override def combine(x: Int, y: Int): Int = x + y
  }

  val intDivision = new Combinator[Int, Float] {
    override def combine(x: Int, y: Int): Float = x / y
  }

  val stringCombine = new Combinator[String, String] {
    override def combine(x: String, y: String): String = s"$x - $y"
  }
}
