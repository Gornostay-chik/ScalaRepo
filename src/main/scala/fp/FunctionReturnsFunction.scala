package fp

//https://docs.scala-lang.org/scala3/book/fun-write-method-returns-function.html
object FunctionReturnsFunction extends App {

  //function without input parameter
  println("1. function without input parameter")
  def greet(): String => Unit = {
    (name: String) => println(s"Hello, $name")
   }

  val greetFunc = greet()
  greetFunc("Joe")

  //function with input parameter
  println("2. function with input parameter")
  def diffGreet(greetString: String): String => Unit = {
    (name: String) => println(s"$greetString, $name")
  }

  val sayHello = diffGreet("Hello")
  sayHello("John")
  val sayHola = diffGreet("Hola")
  sayHola("John")

  //fabrics for functions that return functions
  println("3. fabrics for functions that returns functions")
  def createGreetingFunction(desiredLanguages: String): String => Unit = {
    val englishGreeting = (name: String) => println(s"Hello, $name")
    val frenchGreeting = (name: String) => println(s"Bonjour, $name")

    desiredLanguages match
      case "english" => englishGreeting
      case "french" => frenchGreeting
  }

  val greetInFrench = createGreetingFunction("french")
  greetInFrench("Mark")
  val greetInEnglish = createGreetingFunction("english")
  greetInEnglish("Bob")

}
