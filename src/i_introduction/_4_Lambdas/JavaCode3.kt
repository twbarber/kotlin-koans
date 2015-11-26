package i_introduction._4_Lambdas

import util.JavaCode

class JavaCode3 : JavaCode() {
    public fun task3(collection: Collection<Int>) : Boolean {
        return collection.any {
            c : Int -> c % 42 == 0
        }
    }
}


