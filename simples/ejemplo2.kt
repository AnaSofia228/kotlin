/* Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el
promedio de notas, valide que si el estudiante saca un promedio menor que 3.5 entonces indique que el estudiante perdió la
materia, el mensaje deberá mencionar el nombre y la materia del estudiante */

fun main() {
    print("Ingrese el nombre: ")
    var nombre = readLine()!!

    print("Ingrese el nombre de la materia: ")
    var materia = readLine()!!

    print("Ingrese la nota 1: ")
    var n1 = readLine()!!.toFloat()
    print("Ingrese la nota 2: ")
    var n2 = readLine()!!.toFloat()
    print("Ingrese la nota 3: ")
    var n3 = readLine()!!.toFloat()

    var prom = (n1+n2+n3)/3
    print("El promedio es $prom")

    if (prom < 3.5) {
        print("El estudiante $nombre perdio la materia $materia con un promedio de $prom")
    }
}