package webinar

// extends App
object CaseClasses extends App {
  case class Person(name: String, var age: Int)

  val aPerson = Person("Another Name", 42)
  println(aPerson)

  val secondPerson = Person("Another Name", 42)

  println(aPerson == secondPerson)
}
