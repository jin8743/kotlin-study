package lecture03

import lecture01.Person

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    val person = Person("이영진")
    println("이름 : ${person.name}")


    val str = """
        ABC
        EFG
        QWER
    """.trimIndent()

    println(str)


    val string = "ABC"
    println(str[0])
    println(str[1])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.name)
    }
}