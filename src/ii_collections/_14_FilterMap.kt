package ii_collections

import java.util.*

fun example1(list: List<Int>) {

    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    val cities = customers.map { it.city }
    return cities.toSet()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    return customers.filter {
        it.city.equals(city)
    }
}

