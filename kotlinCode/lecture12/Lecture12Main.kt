package kotlinCode.lecture12

import javaCode.lecture12.Movable

fun main() {

    moveSomething(object : Movable {

        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}