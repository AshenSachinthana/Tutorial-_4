object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter amount: ")
    val number: Double = scala.io.StdIn.readDouble()
    val interest: Double = calculateInterest(number)
    println(s"Interest that the money earns in a year: $interest")
  }

  def calculateInterest(amount: Double): Double = {
    if (amount < 20000) {
      val total = amount * 0.02
      total
    } else if (amount < 200000) {
      val total = amount * 0.04
      total
    } else if (amount < 2000000) {
      val total = amount * 0.035
      total
    } else {
      val total = amount * 0.065
      total
    }
  }
}
