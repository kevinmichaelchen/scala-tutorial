object ArrayPractice {
  def main(args: Array[String]) {

    // iterate
    for (i <- 1 to 10) println(i)
    // functions are 1st class
    args.foreach(arg => println(arg))
    args.foreach((arg: String) => println(arg))
    // for function literals that consist of 1 statement & 1 argument
    args.foreach(println)

    // creating arrays
    val s: Array[String] = new Array[String](1)
    s(0) = "hi"
    // transformed to...
    s.update(0, "hi")
    // using the "static" companion object for Array
    val x = Array.apply(1,2,3)

  }
}

