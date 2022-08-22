import Ex02.Plane1

/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

fun main() {

    println("Digite o modelo do avião: ")
    val modelo1 = readln()

    println("Digite a capacidade do avião: ")
    val capacidade1 = readln().toInt()

    println("Digite o tipo do avião: ")
    val tipo1 = readln()


    val aviao1 = Plane1(
        modelo1,
        capacidade1,
        tipo1,
        1000.0
    )

    aviao1.infoAviao()
}
