package webinar

object ImplicitConversion extends App {
  sealed trait Mamal
  case class Human(name: String) extends Mamal
  case object Dog                extends Mamal

  implicit def convertPersonToMamal(p: Person): Mamal = Human(p.name)

  def greetMamal(m: Mamal): Unit = m match {
    case Human(name) => println(s"Оооо, ${name}е!")
    case Dog => println(s"Хапе ли?")
  }

  greetMamal(Person("Иван", 7))

  trait Adult {
    val canVote: Boolean
  }

  implicit def adultWrapper(p: Person): Adult = new Adult {
    val canVote: Boolean = p.age >= 18
  }

  val kid     = Person("Kid", 6)
  val grandpa = Person("GrandParent", 65)
  println(kid.canVote)
  println(grandpa.canVote)

  // All kinds of syntax extensions
}
