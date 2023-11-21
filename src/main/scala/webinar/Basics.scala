package webinar

// Singleton object
// An object is a class that has exactly one instance
object Basics {
  // Values
  val anIntegerValue: Int  = 42
  val aStringValue: String = "Test"
  // Immutable
//  anIntegerValue = 43

  // Variables, Type Inference
  var anIntegerVariable = 52
  var aStringVariable   = "Another Test"
  aStringVariable = "Reassign"
  anIntegerVariable = 53

  // Methods in classes, objects, traits
  def calculateSumMethod(a: Int, b: Int): Int = a + b

  // main executable method
  def main(args: Array[String]): Unit = {
    println("Values:")
    println(anIntegerValue)
    println(aStringValue)

    println("Variables:")
    println(anIntegerVariable)
    println(aStringVariable)

    println("Result from method call:")
    println(calculateSumMethod(anIntegerValue, anIntegerVariable))
  }
}
