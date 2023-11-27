package kotlinCode.lecture17

import javaCode.lecture17.Fruit

fun main() {

    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("사과", 1_200),
        Fruit("바나나", 1_200),
        Fruit("바나나", 1_200),
        Fruit("바나나", 1_600),
        Fruit("사과", 2_200)
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = { fruits: Fruit -> fruits.name == "사과" }


    isApple(fruits[0])
    isApple.invoke(fruits[0])

    filterFruits(fruits) { it.name == "사과" }


}

fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {

    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}