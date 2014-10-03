object Chapter5 {
  def main(args: Array[String]) {
    val hex = 0x5           // hex as Int
    val oct = 035           // octal as Int
    val prog = 0XCAFEBABEL  // longs end in L, prog: Long = 3405691582
    val big = 1.2345        // big: Double = 1.2345
    val bigger = 1.2345e1   // bigger: Double = 12.345
    val little = 1.2345F    // little: Float = 1.2345
    val littleBigger = 3e5f // littleBigger: Float = 300000.0
    val a = 'A'             // a: Char = A
    val c = '\101'          // c: Char = A   b/c 101 is octal for A
    val d = '\u0041'        // d: Char = A
    val s = 'aSymbol        // symbols are interned; one Symbol object per symbol
    val symName = s.name    // String = aSymbol
    val bool = true

    // OPERATORS AS METHODS
    val sum = 1 + 2       // (1).+(2)
    val myString = "Hello, world!"
    val f = -2.0          // prefix operator notation, equivalent (2.0).unary_-
    myString indexOf 'o'  // infix operator notation
    myString toLowerCase  // postfix operator notation

    // OBJECT EQUALITY
    List(1,2) == List(1,2) // true
    1 == 1.0 // true
    ("he"+"llo") == "hello" // true

    // RICH WRAPPERS (AVAILABLE VIA IMPLICIT CONVERSIONS)
    0 max 5 // 5
    0 min 5 // 0
    -2.7 abs // 2.7
    -2.7 round // -3L
    1.5 isInfinity // false
    (1.0/0) isInfinity // true
    4 to 6 // Range(4,5,6)
    "bob" capitalize // "Bob"
    "robert" drop 2 // "bert"
  }

}
