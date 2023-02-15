/* Algoritmo que calcule lo que gana un empleado con base a las horas trabajadas teniendo en cuenta que cada hora se
paga a 2000, adicionalmente se le realiza unos descuentos con respecto a un impuesto de seguridad del 10% sobre su
salario */

fun main() {
    print("Ingrese las horas trabajadas: ")
    var horasTrabajadas = readLine()!!.toInt()
    var horas = 2000
    var porc = 0.1
    var salaro = horas*horasTrabajadas
    print("El salario base es $salario")
    var descuento = salario*porc
    print("El descuento es $descuento")
    var salarioTotal = salario-descuento
    print("El salario total es $salario")
}
