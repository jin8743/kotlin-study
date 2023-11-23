package k.lecture10

class Cat(species: String) : Animal(species, 4) {

    override fun move() {
        println("걷는다")
    }
}