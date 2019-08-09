package scalafixdocs

object ExampleNoAutoTupling {

  def someMethod(t: (Int, String)) = ???

  someMethod(1, "something") // <<--- The args are auto-tupled
}