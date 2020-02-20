package com.example.aplicationfortests

fun main (args: Array<String>){
//apuntes()
val ingredientes = listOf("Agua","leche", "carne", "verduras", "frutas", "cereal", "huevos", "aceite")
    do {
        println("Bienvenido a Recipe Maker")
        println("Selecciona la opcion deseada\n" +
                "1. Hacer una receta\n" +
                "2. Ver mis recetas\n" +
                "3. Salir")
       val response = readLine()?.toInt()
        when(response){
            1-> println("Ha seleccionado hacer una receta\n")
            2-> println("Ha seleccionado ver mis recetas\n")
        }
    }while (response!=3)


}

fun apuntes() {
//tratar las variables como objetos en vez de como datos primitivos
    val c=2
    val a=3
    val b=a.inc().plus(c)
    println("Prueba con números\nEl valor de c es $c\nEl valor de a es $a\na incrementado, mas c es $b \n")


    a.plus(b) //suma
    a.minus(b) //resta
    a.times(b) //multiplicacion
    a.div(b)  //division
    // los unarios sirven para aplicar las reglas de los signos
    a.unaryPlus()
    a.unaryMinus()

    //OPERADORES LOGICOS
    val boolean = true
    println("valor inicial: $boolean")
    var whatis = boolean.not() //operador de negacion
    println(" operador not: $whatis ")

    whatis = boolean.and(whatis)
    println(" operador and:  $whatis ")

    whatis = boolean.or(whatis)
    println(" operador or: $whatis")

    whatis = boolean.xor(whatis)
    println(" operador xor: $whatis")

    //OPERADORES DE EQUIDAD
    val j = 5
    val k = 12
    println("j es mayor que k? R/: ${j>k}")
}
