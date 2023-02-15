/*  La tienda "Mis Zapatos" está de aniversario, por esa razón se está realizando un descuento del 50% en compras
mayores o iguales a los $ 100.000. Haga un algoritmo que permita validar cuando se debe aplicar un descuento a un cliente,
en caso de que el descuento sea valido se debe informar al usuario indicando el valor descontado.
 */

fun main() {
    print("Ingrese el valor de la compra: ")
    var valorCompra = readLine()!!.toFloat()
    print("Valor Compra: $valorCompra")
    var descuento = 0.0

    if (valorCompra >= 100000) {
        descuento = valorCompra * 0.5
        valorCompra -= descuento
        print("El descuento realizo del 50% es equivalente a: $descuento")
    }
    print("Valor Final: $valorCompra")
}