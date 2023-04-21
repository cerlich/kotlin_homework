package homework

fun MutableList<Int>.square( ){
    this.replaceAll{
        if (it > 46340 || it < -46340)
            it * 0
        else
            it * it}

}
