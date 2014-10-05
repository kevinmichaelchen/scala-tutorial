class TuplePractice {
    // TUPLES
    // Scala infers this to be Tuple2[Int, String].
    // Scala can only infer up to Tuple22
    val pair = (99, "balloons")
    // 1-indexed b/c of Haskell/ML tradition around statically typed tuples
    println(pair._1) // prints 99
}
