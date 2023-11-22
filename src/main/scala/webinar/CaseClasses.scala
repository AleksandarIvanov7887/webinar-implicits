package webinar

// extends App
object CaseClasses extends App {
  case class Person(name: String, var age: Int)

  val aPerson = Person("Another Name", 42)
  println("Case class: " + aPerson)

  val secondPerson = Person("Another Name", 42)

  println("Are the two people equal: " + (aPerson == secondPerson))

  println("Copying: " + aPerson.copy(name = "New Name"))
}
