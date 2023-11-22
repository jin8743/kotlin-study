package lecture06

fun main() {

    val numbers = listOf(1L, 2L, 3L)

    for (number in numbers) {
        println(number)
    }

    for (i in 0..100) {
        println(i)
    }

    for (i in 3 downTo 0) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }
}