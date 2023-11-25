package kotlinCode.lecture13

fun main() {

}

class JavaHouse(
    private val address: String,

    private val livingRoom: LivingRoom = LivingRoom(10.0),
) {

    class LivingRoom(
        private var area: Double,
    )

}