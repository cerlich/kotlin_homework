package homework

fun numberToText(num: Int) : String {
    val units = listOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
    val ten = listOf("один", "две", "три", "четыр", "пят", "шест", "сем", "восем", "девят")
    val tens = listOf("десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестдесят", "семдесят", "восемдесят", "девяносто")
    val hundreds = listOf("сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот")
    var digit: Int = num
    if (num < 0 || num > 1000)
        return "Некорректный аргумент. Число не входит в диапазон 0 .. 1000"
    if (num == 0)
        return "ноль"
    if (num == 1000)
        return "тысяча"
    var str = ""
    if (digit >= 100) {
        digit = num / 100
        str += hundreds[digit - 1]
        digit = num % 100
    }
    if (digit in 10..99) {
        if (digit in 11 .. 19)
            str += " " + ten[digit % 10 - 1] +"надцать"
        else {
            digit /= 10
            str += " " + tens[digit - 1]
            digit = num % 10
        }
    }
    if (digit in 1 .. 9)
        str += " " + units[digit - 1]
    return str.trim(' ')
}