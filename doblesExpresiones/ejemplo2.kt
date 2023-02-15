/* Condicionales Dobles como expresiones */   

fun main() {
    val nota1 = 2.7
    val nota2 = 3.5
    val nota3 = 5.0

    val prom = (nota1+nota2+nota3)/3
    if (prom >= 3.5) println("$prom: Gana la materia") else println("$prom: Pierde la materia")
}
