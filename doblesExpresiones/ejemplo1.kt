/* Condicionales Dobles tradicionales */

fun main() {
    val nota1 = 2.4
    val nota2 = 4.0
    val nota3 = 3.2

    val prom = (nota1+nota2+nota3)/3

    if (prom >= 3.5) {
        println("$prom")
        println("Gana la materia")
    } else {
        println($prom)
        println("Pierde la materia")
    }
}