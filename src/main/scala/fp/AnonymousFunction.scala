package fp

//https://docs.scala-lang.org/scala3/book/fun-anonymous-functions.html
object AnonymousFunction extends App{

  val ints = List(1, 2, 3)

  //longer form
  val doubledInts1 = ints.map((i: Int) => i * 2)
  val doubledInts2 = ints.map((i) => i * 2)
  val doubledInts3 = ints.map(i => i * 2)

  //short form

  val doubleInts = ints.map(_ * 2) // <_ * 2> - this is anonymous function
  doubleInts.foreach(println)

  //shorter form
  println("ints.foreach((i: Int) => println(i))")
  ints.foreach((i: Int) => println(i))
  println("ints.foreach(i => println(i))")
  ints.foreach(i => println(i))
  println("ints.foreach(println(_))")
  ints.foreach(println(_))
  println("ints.foreach(println)")
  ints.foreach(println)

}
