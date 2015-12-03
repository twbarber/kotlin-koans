package ii_collections

import util.TODO

fun todoTask24(): Nothing = TODO(

)

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy { it -> it.length }
    return groupsByLength.values.maxBy { group -> group.size }
}

