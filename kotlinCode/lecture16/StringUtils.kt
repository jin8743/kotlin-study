package kotlinCode.lecture16

fun main() {

    val str = "ABC"
    println(str.lastChar())
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}