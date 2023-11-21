package webinar

case class Person(name: String, age: Int)

object Person {
//  implicit val personOrder: Ordering[Person] =
//    Ordering
//      .by[Person, Int](_.age)
//      .orElse(Ordering.by[Person, String](_.name).reverse)
}
