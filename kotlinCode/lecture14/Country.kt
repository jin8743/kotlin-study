package kotlinCode.lecture14

import kotlinCode.lecture14.Country.*

fun handleCountry(country: Country) {
    when (country) {
        KOREA -> TODO()
        AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String,
) {

    KOREA("KO"),
    AMERICA("US")
    ;

}