package scalafixdocs

object ExampleNoValInForComprehension {

  for {
    n <- List(1, 2, 3)
    val inc = n + 1
  } yield inc
}