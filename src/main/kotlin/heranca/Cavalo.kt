package heranca

class Cavalo(
    nome: String,
    idade: Int,
    val cor: String
): Animal(nome, idade) {

    override fun emitirSom() {
        println("relinchando")
    }


    fun correr(){
        println("Correndo como um cavalo")
    }

    fun exibirinfos(){
        println("O nome do cavalo é $nome tem $idade anos, sua cor é $cor")
    }
}