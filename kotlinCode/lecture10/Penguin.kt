package kotlinCode.lecture10

class Penguin(species: String) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2


    override fun move() {
        println("움직인다")
    }


    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}