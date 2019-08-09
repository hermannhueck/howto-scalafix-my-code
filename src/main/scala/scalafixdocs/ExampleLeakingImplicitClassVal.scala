package scalafixdocs

object ExampleLeakingImplicitClassVal {

  implicit class XtensionVal(val str: String) extends AnyVal { // <<--- str should be private
    def doubled: String = str + str
  }
      
  "message".str // compiles, but shouldn't
}