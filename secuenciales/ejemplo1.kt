/* Algoritmo que solicite el nombre de una persona y 3 notas, calcule el promedio de ellas */

fun main() {
    print("Ingrese el nombre: ")
    var nombre = readLine()
    print("Ingrese la nota 1: ")
    var n1:Double = readLine()!!.toDouble()
    print("Ingrese la nota 2: ")
    var n2:Double = readLine()!!.toDouble()
    print("Ingrese la nota 3: ")
    var n3:Double = readLine()!!.toDouble()
    var prom:Double = (n1+n2+n3)/3
    print("$nombre el promedio es $prom")
    print("%.2f".format(prom))
}