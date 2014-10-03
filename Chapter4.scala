class Chapter4 {
  private var sum = 0

  def add(b: Byte): Unit = {
    // b = 1 // won't compile, since parameters are vals
    sum += b
  }

  // more concise: one-line definitions w/o equals sign are Units (i.e., need braces)
  // def add(b: Byte) { sum += b }

  def checksum(): Int = ~(sum & 0xFF) + 1
}


// companion object, singleton, holds companion class' statics
object Chapter4 extends Application {
  // the Application trait cuts off access from command-line args
  // need explicit main method for multi-threaded
}
