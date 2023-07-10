object Q5 {
  def main(args: Array[String]): Unit = {
    print("Enter Number :")
    val number = scala.io.StdIn.readInt()
    val result = sumOfEven(number-1)
    println(result)
  }

  def sumOfEven(n: Int): Int = {
    if (n <= 0)
      0
    else if (n % 2 == 0)
      n + sumOfEven(n - 2)
    else
      sumOfEven(n - 1)
  }
}
