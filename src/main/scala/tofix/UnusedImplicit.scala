package tofix

object UnusedImplicit {

  trait Foo

  def myMethod[X](foo: Foo)(implicit x: X): Foo = {
    foo
  }
}