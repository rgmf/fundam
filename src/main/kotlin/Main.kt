package com.proferoman

import com.proferoman.solutions.Person

/**
 * Dada una colección de nombres (de tipo String) escribir un programa en Kotlin que muestre por pantalla una colección con las
 * dimensiones de los nombres. Por ejemplo, dada la lista ["Alice", "Bob", "Mary", "Jon"] el programa mostrará por pantalla la lista
 * [5, 3, 4, 3]. Usa la función de orden superior map.
 */
fun namesLen(names: List<String>): List<Int> {
    TODO()
}

/**
 * Escribir un programa en Kotlin que construya una lista de frases y las muestre del revés. Usa la función de orden superior map para ello.
 */
fun reverseNames(sentences: List<String>): List<String> {
    TODO()
}

/**
 * Escribir un programa en Kotlin que, dada una lista de palabras, utilice filter para crear una nueva lista que contenga solo las palabras
 * que tienen más de 5 caracteres.
 */
fun onlyFiveCharWords(words: List<String>): List<String> {
    TODO()
}

/**
 * Escribir un programa en Kotlin que, dada una lista de cadenas, utilice filter para obtener una nueva lista que contenga solo las
 * cadenas que contienen la letra “a”.
 */
fun onlySentencesWithA(sentences: List<String>): List<String> {
    TODO()
}

data class Person(val name: String, val age: Int)

/**
 * Dada la data class Person de arriba:
 *
 * Escribir un programa que, dado una lista de Person, utilice filter para obtener una nueva lista de Peron que sean mayores de edad
 * (que tengan 18 años o más).
 */
fun getAdults(persons: List<Person>): List<Person> {
    TODO()
}

/**
 * Dada la data class Person anterior, escribir un programa que, dado una lista de Person, utilice fold para obtener la suma de las
 * edades de las personas de dicha lista.
 */
fun sumOfAges(persons: List<Person>): Int {
    TODO()
}

/**
 * Haz lo mismo que en la función anterior pero usando la función de orden superior sumOf (investiga sobre ella si fuera necesario).
 */
fun sumOfAgesVersion2(persons: List<Person>): Int {
    TODO()
}

fun main() {

}