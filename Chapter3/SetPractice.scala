class SetPractice {
      // SETS
    // by default Scala uses scala.collection.immutable.Set
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
    // for mutable sets, we can use a val
    val movieSet: scala.collection.mutable.Set = Set("Hitch", "Poltergeist")
    movieSet += "Shrek" // equivalent to movieSet.+=("Shrek")
    println(movieSet + "Star Wars")
}
