package homework

import java.io.StringWriter
import kotlin.math.sqrt

//fun MutableList<Int>.square( ){
//    this.replaceAll{it * it}
//}

fun main() {
    //println("Hello World!")
   /* var list  = listOf(13.31, 3.98, 12.0, 2.99, 9.0, null)
    //list.square();
    println("%.2f".format(formatList(list)))
    list = listOf(-4.5, 0.0, Double.MAX_VALUE, Double.MIN_VALUE)
    println("%.2f".format(formatList(list)))
    list = listOf(null)
    println("%.2f".format(formatList(list)))
    list = listOf(1.1)
    println("%.2f".format(formatList(list)))
    list = listOf(24.2, 78.3, 33.4, 54.16, 97.34, 15.98, 1.2, 2.0, -7.0, 0.0, 54.3 )
    println("%.2f".format(formatList(list)))
    list = listOf()
    println("%.2f".format(formatList(list)))*/
    //println(digitToText(2))
    //println(list)
    /*compareTypes(46341)
    compareTypes(0)
    compareTypes(-46342)
    compareTypes(1)
    compareTypes(225.234)
    println(-46342 * -46342)
    println(-46341 * -46341)
    println(-46340 * -46340)
    println(46341 * 46341)
    println(46340 * 46340)*/
    //types(null)
    //StringWriter w = new StringWriter()
    val list = mutableListOf(Int.MAX_VALUE, Int.MIN_VALUE)
    list.square()
    println(list)

}