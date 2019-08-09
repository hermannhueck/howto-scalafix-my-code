package scaluzzi

object ExampleMissingFinal extends App {

    sealed trait MyADT extends Product with Serializable

    case class Foo(s: String) extends MyADT    // <<--- missing final
    case class Bar(i: Int) extends MyADT
    case class Baz(b: Boolean) extends MyADT
}