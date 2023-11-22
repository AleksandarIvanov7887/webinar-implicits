package webinar

object Classes {
  // Parameters without val or var are private values,
  // visible only within the class.
  class Person(val name: String, var age: Int, ssn: String = "1-2-3")

  def main(args: Array[String]): Unit = {
    // new keyword
    val aPerson      = new Person("Name", 31, "1-2-3")

    // default values for skipped arguments
    val secondPerson = new Person("Name", 31)

    // named arguments
    val thirdPerson = new Person(age = 12, name = "Different Name")

    // Access fields of the class
    println("First Person's name: " + aPerson.name)

    aPerson.age = 32
    println("Second Person's age: " + aPerson.age)

    // Private field
//    println(aPerson.ssn)

    // Printing the pointer
    println("Print first person: " + aPerson)

    // Equality by pointer
    println("Are first two people equal: " + (aPerson == secondPerson))
  }
}