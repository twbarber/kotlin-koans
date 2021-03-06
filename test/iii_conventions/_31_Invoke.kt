package iii_conventions

import junit.framework.Assert
import org.junit.Test

class _31_Invoke {
    @Test fun testTask17() {
        Assert.assertEquals(4, task31(Invokable()))
    }

    @Test fun testNumberOfInvocations() {
        val message = "The number of invocations is incorrect"
        fun testInvokable(numberOfInvocations: Int, invokeSeveralTimes: (Invokable) -> Invokable) {
            val invokable = Invokable()
            Assert.assertEquals(message, numberOfInvocations, invokeSeveralTimes(invokable).getNumberOfInvocations())
        }

        testInvokable(1) { it() }
        testInvokable(5) { it()()()()() }
        testInvokable(0) { it }
    }

    operator fun Invokable.invoke() = todoTask31()
    fun Invokable.getNumberOfInvocations() = todoTask31()
}
