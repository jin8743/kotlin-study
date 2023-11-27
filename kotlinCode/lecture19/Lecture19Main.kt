package kotlinCode.lecture19

import javaCode.lecture17.Fruit
import kotlinCode.lecture19.a.printHelloWorld as printHelloWorldA
import kotlinCode.lecture19.b.printHelloWorld as printHelloWorldB

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

data class UltraSuperGuardianTribe(
    val name: String
)

data class Person(
    val name: String,
    val age: Int,
)

typealias USGTMAP = Map<String, UltraSuperGuardianTribe>

fun main() {

    printHelloWorldA()
    printHelloWorldB()

    val person = Person("이영진", 100)
    println(person)
    val (name, age) = person
    println("이름: $name, 나이: $age")
}
