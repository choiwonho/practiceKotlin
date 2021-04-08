class Person(val firstName : String = "Peter", val lastName : String = "Parker") {
    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    fun printInfo(){
        val nickNameToPrint = if(nickName != null) nickName else "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}