package kotlinCode.lecture15

fun main() {

    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("$i ${array[i]}")
    }


    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    val numbers = listOf(100, 200)
    println(numbers[0])

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    val emptyList = emptyList<Int>()

    val mutableList = mutableListOf(100, 200)
    mutableList.add(1)


    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}