package homework

import java.text.DecimalFormat
import java.text.NumberFormat
import java.time.LocalDate

fun compareTypes(type: Any?) : String {
    var result = ""
    when(type){
        is String -> result = "Я получил String = '$type', eё длина равна ${type.length}"
        is Int -> result = "Я получил Int = $type, его квадрат " +
                (if (type >= 46341 || type <= -46341) "не входит в диапазон INT"
                else "равен ${type * type}")
        is Double -> {
            val nf: NumberFormat = DecimalFormat("#.##")
            result = "Я получил Double = $type, это число округляется до ${nf.format(type)}" }
        is LocalDate -> {
            val date = LocalDate.of(2006,12,24)
            result = "Я получил LocalDate $type, она " +
                    "${if (type < date) "меньше даты"
                    else if (type == date) "равна дате"
                    else "больше даты"} основания Tinkoff"}
        null -> result = "Объект равен null"
        else -> result = "Мне этот тип неизвестен"
    }
    println(result)
    return result
}