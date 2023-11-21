package webinar

object Traits {
  trait GRAO {
    def getPerson(egn: String): Option[Person]
  }

  trait MinistryOfHealth {
    def createRecord(person: Person): String
  }

  class PeopleService(var database: Map[String, Person]) extends GRAO with MinistryOfHealth {
    override def getPerson(egn: String): Option[Person] =
      database.get(egn)

    override def createRecord(person: Person): String = {
      val newEgn = person.hashCode().toString
      database = database + (person.hashCode().toString -> person)
      newEgn
    }

  }
}
