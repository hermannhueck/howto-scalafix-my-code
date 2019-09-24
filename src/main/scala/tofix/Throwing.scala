package tofix

import scala.util.Try

object Throwing extends App {

  implicit class StringOps(private val s: String) {
    def toMaybeInt: Option[Int] = Try(s.toInt).toOption
  }

  def checkNumber(string: String): Unit = {

    if (string.isEmpty()) {
      throw new IllegalArgumentException("string is empty") // scalafix:ok
    } else {

      // scalafix:off
      val num = string.toMaybeInt match {
        case None      => throw new NumberFormatException("not an Int")
        case Some(int) => int
      }

      if (num < 0) {
        throw new RuntimeException("negative Int")
      }
      // scalafix:on

      println(s"The number was: $num")
    }
  }

  @SuppressWarnings(Array("scalafix:DisableSyntax.throw"))
  def run(args: List[String]) =
    if (args.length == 0) {
      throw new IllegalArgumentException("no args specified")
    } else {
      checkNumber(args.head)
    }

  run(args.toList)
}
