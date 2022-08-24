package heranca

class Preguica(
    nome: String,
    idade: Int,
    val cor: String
): Animal(nome, idade) {

    override fun emitirSom() {
        println("Som da preguiça")
    }
    fun subirArvore(){
        println("Subindo na árvore como uma preguiça")
    }

    fun exibirinfos(){
        println("O nome da preguiça é $nome tem $idade anos, sua cor é $cor")
    }
}