fun sayHell(itemToGreet : String) {
    val msg = "Hello $itemToGreet"
    println(msg)
}

fun main() {
    sayHell("Kotlin")
    sayHell("World")

}