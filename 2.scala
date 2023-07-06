object Q2 {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn
    print("Enter a Number : ")
    val number = StdIn.readInt()

    println("The number is " + PatternMatching(number))
  }
  def PatternMatching(number : Int) : String = number match{
      case x if number <= 0 => "a Negative/Zero"
      case x if number%2 == 0 => "an Even"
      case x if number%2 != 0 => "an Odd"
    }
}