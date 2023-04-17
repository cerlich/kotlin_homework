package homework

fun MutableList<Int>.square( ){
    this.replaceAll{it * it}
}
