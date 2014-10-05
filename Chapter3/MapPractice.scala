class MapPractice {
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
}
