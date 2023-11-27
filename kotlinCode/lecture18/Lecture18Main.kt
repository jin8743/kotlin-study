package kotlinCode.lecture18

import javaCode.lecture17.Fruit

fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {

    return fruits.filter(filter)
}

fun isAllApple(fruits: List<Fruit>): Boolean {
    return fruits.all { fruit -> fruit.name == "사과" }
}