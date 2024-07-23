//> using dep org.scalameta::munit:1.0.0

class TestSuite extends munit.FunSuite {
    val expected = Seq("files.scala", "files.test.scala")
    val provided = filesByExtension("scala").map(_.last).toSet
    assertEquals(provided, expected)
}
