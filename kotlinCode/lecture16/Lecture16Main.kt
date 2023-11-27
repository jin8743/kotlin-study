package kotlinCode.lecture16

import javaCode.lecture16.Person

fun Person.nextYearAge(): Int {

    println("확장 함수")
    return this.age + 1
}

fun main() {

    val person = Person("ABC", "DEF", 10)
    person.nextYearAge()
}