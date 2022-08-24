package heranca

class Cachorro (
     nome: String,
     idade: Int,
     val raca: String,
     val cor: String
        ): Animal(nome, idade) {

    override fun emitirSom() {
        println("Latindo")
    }

    fun correr(){
        println("Correndo como um cachorro")
    }

    fun exibirinfos(){
        println("O nome do cachorro é $nome tem $idade anos, sua raça é $raca e sua cor é $cor")
    }

}