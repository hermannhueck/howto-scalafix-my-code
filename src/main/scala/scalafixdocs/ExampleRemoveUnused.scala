package scalafixdocs

// unused imports
import scala.List // <<---
import scala.collection.{immutable, mutable} // <<---

object ExampleRemoveUnused {

  val seq = immutable.Seq.empty[Int]
  println(seq)

  // unused local symbols
  def app() = {
    val unused = "message" // <<---
    println("Hello world!")
  }
      
  // unused private member
  private def unused = "remove me"
}