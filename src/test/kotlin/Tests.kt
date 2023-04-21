import homework.*

import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class Tests {

    private fun unitAssertSquare(msg : String, exp : MutableList<Int>, act : MutableList<Int>) {
        act.square()
        assertEquals(message = "Invalid result of square collection", expected = exp, actual = act)
    }
    @Test
    fun testSquare() {
        unitAssertSquare(" with positive elements", mutableListOf(1, 4, 9, 16), mutableListOf(1, 2, 3, 4))
        unitAssertSquare(" with 1 element", mutableListOf(625), mutableListOf(25))
        unitAssertSquare(" with negative elements", mutableListOf(0, 4, 6084), mutableListOf(0, -2, -78))
        unitAssertSquare(" with max and min value", mutableListOf(0, 0), mutableListOf(Int.MAX_VALUE, Int.MIN_VALUE))
        unitAssertSquare(" with values whose square is greater than INT", mutableListOf(0, 0), mutableListOf(50000, -72580))
        unitAssertSquare(" without elements", mutableListOf(), mutableListOf())
    }

    private fun assertCompareTypes(msg : String, exp : String, act : Any?) {
        assertEquals(message = "Invalid result of $msg", expected = exp, actual = compareTypes(act))
    }

    @Test
    fun testCompareTypes() {
        val test1 = "Privet Andrey"
        assertCompareTypes("String","Я получил String = '$test1', eё длина равна 13", test1)
        assertCompareTypes("String","Я получил String = '', eё длина равна 0", "")
        var test2 = Int.MAX_VALUE
        assertCompareTypes("Int", "Я получил Int = $test2, его квадрат не входит в диапазон INT", test2)
        test2 = Int.MIN_VALUE
        assertCompareTypes("Int", "Я получил Int = $test2, его квадрат не входит в диапазон INT", test2)
        assertCompareTypes("Int", "Я получил Int = 25, его квадрат равен 625", 25)
        assertCompareTypes("Int", "Я получил Int = 0, его квадрат равен 0", 0)
        assertCompareTypes("Int", "Я получил Int = -5, его квадрат равен 25", -5)
        assertCompareTypes("Double", "Я получил Double = 423.0, это число округляется до 423", 423.0)
        assertCompareTypes("Double", "Я получил Double = 423.435, это число округляется до 423,44", 423.435)
        assertCompareTypes("Double", "Я получил Double = 423.432, это число округляется до 423,43", 423.432)
        assertCompareTypes("null", "Объект равен null", null)
        assertCompareTypes("Float", "Мне этот тип неизвестен", 43.2f)
        var date = LocalDate.of(2006,12,24)
        assertCompareTypes("LocalDate", "Я получил LocalDate $date, она равна дате основания Tinkoff", date)
        date = LocalDate.of(2022, 7, 3)
        assertCompareTypes("LocalDate", "Я получил LocalDate $date, она больше даты основания Tinkoff", date)
        date = LocalDate.of(1869, 4, 24)
        assertCompareTypes("LocalDate", "Я получил LocalDate $date, она меньше даты основания Tinkoff", date)
    }

    private fun assertFormatList(msg : String, exp : String, act : MutableList<Double?>) {
        assertEquals(message = "Invalid result of format list $msg", expected = exp, actual = "%.2f".format(formatList( act)))
    }

    @Test
    fun testFormatList() {
        assertFormatList("with less than 10 elements", "22,09",
                            mutableListOf(13.31, 3.98, 12.0, 2.99, 9.0, null))

        assertFormatList("with max and min value", "20,25",
                            mutableListOf(-4.5, 24.0, Double.MAX_VALUE, Double.MIN_VALUE))

        assertFormatList("with empty list", "0,00",
                            mutableListOf())

        assertFormatList("with only null", "0,00",
                            mutableListOf(null, null))

        assertFormatList("with more than 10 elements and 0.0", "25,79",
                            mutableListOf(24.2, 78.3, 33.4, 54.16, 97.34, 15.98, 1.2, 2.0, -7.0, 0.0, 54.3))

        assertFormatList("with 1 element", "0,55",
                            mutableListOf(1.1))
    }

    private fun assertNumberToText(msg : String, exp : String, act : Int) {
        assertEquals(message = "Invalid result of convert $msg", expected = exp, actual = numberToText(act))
    }

    @Test
    fun testNumberToText() {
        assertNumberToText("0 to 9", "один", 1)
        assertNumberToText("0 to 9", "ноль", 0)
        assertNumberToText("1 to 9", "девять", 9)
        assertNumberToText("10 to 19", "десять", 10)
        assertNumberToText("10 to 19", "одиннадцать", 11)
        assertNumberToText("10 to 19", "пятнадцать", 15)
        assertNumberToText("10 to 19", "девятнадцать", 19)
        assertNumberToText("20 to 99", "двадцать", 20)
        assertNumberToText("20 to 99", "сорок три", 43)
        assertNumberToText("20 to 99", "девяносто девять", 99)
        assertNumberToText("100 to 1000", "сто", 100)
        assertNumberToText("100 to 1000", "семьсот пятьдесят три", 753)
        assertNumberToText("100 to 1000", "девятьсот девяносто девять", 999)
        assertNumberToText("100 to 1000", "тысяча", 1000)
    }
}