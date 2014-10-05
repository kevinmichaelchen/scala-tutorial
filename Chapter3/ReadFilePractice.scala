class ReadFilePractice {
    // READ LINES FROM FILE
    import scala.io.Source
    if (args.length > 0) {
      // getLines method returns Iterator[String]
      for (line <- Source.fromFile(args(0)).getLines)
        print(line.length + " " + line
    } else Console.err.println("Please enter filename")
}
