//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    SendMessage( name= "Hulash" )
}
fun SendMessage(name: String= "Ina", Message: String= sendText()){
    println("Name = $name and Message = $Message")

}
 fun sendText() = "Some Text "


