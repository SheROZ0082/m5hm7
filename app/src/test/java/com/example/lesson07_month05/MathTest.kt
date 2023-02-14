package com.example.lesson07_month05

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MathTest {
    private var math:Math?=null

    @Before
    fun before(){math=Math()}
    @Test
    fun sum(){Assert.assertEquals("4",math?.sum("2","2"))}
    @Test(expected = ArithmeticException::class)
    fun divide(){math?.divide(4,0) }
    @Test
    fun minus(){Assert.assertEquals("4" ,math?.minus("8","4"))}
    @Test
    fun increase(){Assert.assertEquals("10",math?.increase("5","2"))}
    @Test
    fun percent(){Assert.assertEquals(75.0,math?.percent(250.0,30.0))}
    @Test
    fun squareRoot(){Assert.assertEquals(36,math?.squareRoot(2,4))}
    @After
    fun after(){math= null}
}