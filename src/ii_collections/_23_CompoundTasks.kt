package ii_collections

import ii_collections.data.customers
import ii_collections.data.orderedProducts

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    return customers.filter {
        it.orderedProducts.contains(product)
    }.toSet()
}

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    // Return the most expensive product among all delivered products
    // (use the Order.isDelivered flag)
    return customers.filter {
        orderedProducts.
    }
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    // Return the number of times the given product was ordered.
    // Note: a customer may order the same product for several times.
    return customers.filter {
        orderedProducts.
    }.count {  }
}
