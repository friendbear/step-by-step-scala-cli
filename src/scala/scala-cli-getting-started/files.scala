//> using dep com.lihaoyi::os-lib:0.10.3

// A project, vol 1
def filesByExtension(
  extension: String,
  dir: os.Path = os.pwd): Seq[os.Path] =
    os.walk(dir).filter { f =>
      f.last.endsWith(s".$extension") && os.isFile(f)
    }

def main(args: Array[String]): Unit = {

  // A project, vol 2
  val (ext, directory) = args match {
    case Array(ext, dir) => (ext, os.Path(dir))
    case Array(ext) => (ext, os.pwd)
    case _ =>
      println("Expected: `extention [directory']`")
      sys.exit(1)
  }

  val files = filesByExtension(ext, directory)
    .map(_.relativeTo(directory)).foreach(println)
}