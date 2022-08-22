/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

fun main() {

    val clienteObj = Cliente()

    clienteObj.nome = "Giovanni"
    clienteObj.idade = 23
    clienteObj.cidade = "Sorocaba"

    println(clienteObj.nome)
    println(clienteObj.idade)
    println(clienteObj.cidade)
}
