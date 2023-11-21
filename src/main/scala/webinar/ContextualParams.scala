package webinar

object ContextualParams extends App {
  private val listOfNumbers = List(1, 42, 52, 14, 52, 37)

  println(listOfNumbers.max)

  val people: List[Person] = List(
    Person("Ivan", 21),
    Person("Dragan", 57),
    Person("Petkan", 43),
    Person("Ana", 57),
  )

//  val oldest = people.maxOption

//  val personOrder = new Ordering[Person] {
//    override def compare(x: Person, y: Person): Int = x.age.compare(y.age)
//  }
//  println("Implemented ordering: " + people.max(personOrder))

//  val personOrder = Ordering.by[Person, Int](p => p.age)
//  println("Fancy ordering creation method: " + people.max(personOrder))

//  val personOrder = Ordering.by[Person, Int](_.age).orElse(Ordering.by[Person, String](_.name).reverse)
//  println("Some more logic in ordering: " + people.max(personOrder))

//  implicit val personOrder =
//    Ordering.by[Person, Int](_.age)
//      .orElse(Ordering.by[Person, String](_.name).reverse)
//  println(people.max)

//  println(people.sorted)


//  def foldV4[A, B](x: A, y: A)(implicit combinator: Combinator[A, B]): B = combinator.combine(x, y)

//  implicit val personCombinator = new Combinator[Person, Family] {
//    override def combine(x: Person, y: Person): Family = Family(x, y)
//  }
//  foldV4[Person, Family](Person("Husband", 30), Person("Wife", 29))

//  class Folder[A, B](x: A, y: A)(implicit combinator: Combinator[A, B]) {
//    def foldV5(): B = combinator.combine(x, y)
//  }

  // In
  // - ActorSystems
  // - Effect Systems - Cats IO, ZIO
  // - Scala built-in Futures
  // - Database frameworks
  // - Libraries for collections
}
