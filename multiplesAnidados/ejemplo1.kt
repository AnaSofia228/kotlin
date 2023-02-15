/* Ingrese la edad de una persona y valide si es mayor o menor de edad, adicionalmente si la persona tiene 25 años
menciónelo.
 */

fun main() {
    print("Ingrese la edad: ")
    var edad = readLine()!!.toInt() 

    if (edad > 18) {
        print("La persona es mayor de edad")
        if (edad == 25) {
            print("La persona tiene 25 años")
        }
    } else {
        print("La persona es menor de edad.")
    }
}