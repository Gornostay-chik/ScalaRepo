package fp

//https://docs.scala-lang.org/scala3/book/fun-function-variables.html
object FunctionVariables extends App{

  val ints = List(1, 2, 3)

  val doubleIntsByAnonymousFunction = ints.map((i: Int) => i * 2) // <(i: Int) => i * 2> - this is anonymous fuction

  val doubleFunc = (i: Int) => i * 2
  val tripleFunc = (i: Int) => i * 3

  val doubleIntsByFunctionVariables = ints.map(doubleFunc)
  val tripleIntsByFunctionVariables = ints.map(tripleFunc)

  //store function in List
  val functionList = List(doubleFunc, tripleFunc)
  val doubleTripleList = functionList.foreach(func => println(ints.map(func)))


  //store function in Map
  val functionMap = Map(
    "2x" -> doubleFunc,
    "3x" -> tripleFunc
  )



}
