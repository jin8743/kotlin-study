package kotlinCode.lecture12

fun main() {

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int,
) {

    companion object : Log {

        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("하하")
        }
    }
}

object Singleton {
    var a: Int = 0
}