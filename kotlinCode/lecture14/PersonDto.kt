package kotlinCode.lecture14

fun main() {
    val dto1 = PersonDto("이영진", 1)
    val dto2 = PersonDto("이영진", 1)

    println(dto1 == dto2)
}

data class PersonDto(
    val name: String,
    val age: Int,
)