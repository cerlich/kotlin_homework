package homework

fun formatList(list: List<Double?>) : Double{
    val format = list
        .asSequence()
        .filter {it != null}
        .map {
            if (it!!.toInt() % 2 == 0 )
                it * it
            else
                it / 2
        }
        .filter { it <= 25}
        .sortedByDescending { it }
        .take(10)
        .toList()
    return format.sum();
}