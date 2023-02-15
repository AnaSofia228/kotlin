/* Algoritmo que solicite la edad de una persona, si la edad es menor a 18 indique es la persona es menor de edad, de lo
contrario indique que es mayor de edad
 */

fun main() {
    print("Ingrese la edad: ")
    var edad = readLine().toInt()

    print("Edad: $edad")
    if (edad < 18) {
        print("La persona es menor de edad")
    } else {
        print("La persona es mayor de edad")
    }
}
