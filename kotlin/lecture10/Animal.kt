package kotlin.lecture10

abstract class Animal(
    protected val species: String,
    protected val legCount: Int,
){

    abstract fun move()

}