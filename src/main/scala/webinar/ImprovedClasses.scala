package webinar

object ImprovedClasses {
  class Person(name: String, var age: Int) {
    private def getName: String = name

    // Override toString, called in println method
    override def toString: String = s"Person(name: $name, age: $age)"

    // Override equals, so that they are instances are compared by value
    override def equals(obj: Any): Boolean =
      if (obj.isInstanceOf[Person]) {
        val asPerson = obj.asInstanceOf[Person]
        this.name == asPerson.getName && this.age == asPerson.age
      } else {
        false
      }
  }

  // Companion object, same name as class or trait
  //  A companion class or object can access the private members of its companion.
  //  Use a companion object for methods and values which are not specific to
  //  instances of the companion class.
  object Person {
    // Apply method
    def apply(name: String) = new Person(name, 0)

    // Same for all instances
    val ForbiddenNames: Set[String] = Set("R2D2")

    def of(name: String): Option[Person] =
      Option.when(!ForbiddenNames.contains(name))(new Person(name, 0))

    def unsafeOf(name: String): Person =
      if (ForbiddenNames.contains(name))
        throw new IllegalArgumentException("That's a forbidden name")
      else
        new Person(name, 0)
  }

  def main(args: Array[String]): Unit = {
    // no need for new, because of apply
    val secondPerson = Person("Newborn Baby")
    // called toString
    println("Improved print: " + secondPerson)

    // called equals
    println("Are the two people equal: " + (Person("Aleksandar") == Person("Aleksandar")))

    println("Safe creation: " + Person.of("R2D2"))

    println("Unsafe creation: " + Person.unsafeOf("R2D2"))
  }
}
