// run by
// scala-cli hello.sc
def helloMessage(name: Seq[String]) = name match
    case Nil =>
        "Hello"
    case names =>
        names.mkString("Hello: ", ", ", "! ")