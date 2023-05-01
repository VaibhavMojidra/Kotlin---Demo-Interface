interface ExampleInterface  {
   var myVar: Int            // abstract property
   fun absMethod():String    // abstract method
   
   fun hello() {
      println("Hello there")
   }
}
class InterfaceImp : ExampleInterface {
   override var myVar: Int = 25
   override fun absMethod() = "This is abstract method"
}
fun main(args: Array<String>) {
   val obj = InterfaceImp()
   println("My Variable Value is = ${obj.myVar}")
   print("Calling hello(): ")
   obj.hello()
   
   print("Message -")
   println(obj.absMethod())
}