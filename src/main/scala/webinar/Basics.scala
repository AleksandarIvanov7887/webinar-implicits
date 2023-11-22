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
    println("Basics")

    println("Int Values: " + anIntegerValue)
    println("String Values: " + aStringValue)

    println("Variables: " + anIntegerVariable)
    println("Variables: " + aStringVariable)

    println("Result from method call: " + calculateSumMethod(anIntegerValue, anIntegerVariable))
  }
}
