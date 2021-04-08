fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    /* use 1
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }
    */

    /* use 2
    interestingThings.forEach { interestingThings ->
        println(interestingThings)
    }
     */

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }

    val map = mapOf(1 to "a" , 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value")  }
}