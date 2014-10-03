object Chapter3 {
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

    // creating lists
    val y = List(1,2,3)
    val z = List(4,5,6)
    // list concatenation
    val w = y ::: z

    // explicitly instantiating lists
    // normal infix operators like * (multiplication) are invoked on the left-hand operand
    // i.e., a * b becomes a.*(b)
    // however, operators ending in a colon like :: (cons) are invoked on the right-hand operand
    // you need Nil at the end b/c Nil is a list, which recognizes the cons operator (Ints do not)
    val p = 1 :: 2 :: 3 :: Nil
    // no append operation since O(n), whereas prepend with cons is O(1).
    // to append, use prepend and reverse


    // LIST CHEAT SHEET
    var q = List() // empty list
    q = Nil        // empty list
    q = 1 :: 2 :: 3 :: 4 :: Nil
    q.count(s => s % 2 == 0)   // count even numbers
    q.exists(s => s % 2 == 0)  // does list contain an even number?
    q.forall(s => s % 2 == 0)  // are all elements even numbers?
    q.filter(s => s % 2 == 0)  // return list of even numbers
    q.foreach(s => println(s)) // for each
    q.drop(2)                  // drops the first 2 elements, returns 3 :: 4 :: Nil
    q.dropRight(2)             // drops the last 2 elements, returns 1 :: 2 :: Nil
    q.head                     // first element
    q.last                     // last element
    q.init                     // returns all but the last element, like q.dropRight(1)
    q.tail                     // returns all but the first element, like q.drop(1)
    q.isEmpty                  // is the list empty?
    q.length                   // list length
    q.map(s => s * s)          // map: returns a list of the squares
    q.mkString(",")            // returns "1, 2, 3, 4"
    q.remove(s => s % 2 == 0)  // returns a list with the even numbers removed
    q.reverse                  // returns 4 :: 3 :: 2 :: 1 :: Nil
    q.sort((s,t) => s < t)     // sorts list in ascending order


    // TUPLES
    // Scala infers this to be Tuple2[Int, String].
    // Scala can only infer up to Tuple22
    val pair = (99, "balloons")
    // 1-indexed b/c of Haskell/ML tradition around statically typed tuples
    println(pair._1) // prints 99

    // SETS
    // by default Scala uses scala.collection.immutable.Set
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
    // for mutable sets, we can use a val
    val movieSet: scala.collection.mutable.Set = Set("Hitch", "Poltergeist")
    movieSet += "Shrek" // equivalent to movieSet.+=("Shrek")
    println(movieSet + "Star Wars")

    // MAPS
    // immutable map is the default
    val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    println(romanNumberal(4))
    // mutable maps
    import scala.collection.mutable.Map
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "a")
    println(treasureMap(0))

    // READ LINES FROM FILE
    import scala.io.Source
    if (args.length > 0) {
      // getLines method returns Iterator[String]
      for (line <- Source.fromFile(args(0)).getLines)
        print(line.length + " " + line
    } else Console.err.println("Please enter filename")

  }
}

