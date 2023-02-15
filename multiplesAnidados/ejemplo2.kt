/* haga un algoritmo que calcule el promedio de 3 números y si el promedio es mayor a 3.5 indique que gana la materia,
si el promedio es mayor a 2 y menor o igual a 3.5 entonces indique que puede recuperar */

fun main()  {
    val nota1 = 2.4
    val nota2 = 5.0
    val nota3 = 4.5

    val promedio = (nota1+nota2+nota3)/3
    val resultado = if (promedio > 3.5) "Gana" if (promedio >= 2) "Recuperar" else "Pierde"

    print("El estudiante $resultado la materia con un promedio de $promedio")
}