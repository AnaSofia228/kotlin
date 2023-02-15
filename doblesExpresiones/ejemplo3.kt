/* Condicionales Dobles como expresiones con asignación a variable */

fun main() {
    val nota1 = 5.0
    val nota2 = 1.5
    val nota3 = 4.2

    val prom = (nota1+nota2+nota3)/3
    val result = if (prom >= 3.5) "Gana" else "Pierde"

    println("$prom: El estudiante $result la materia")
}