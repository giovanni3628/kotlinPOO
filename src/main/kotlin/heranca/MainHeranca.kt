import heranca.Cachorro
import heranca.Cavalo
import heranca.Preguica

fun main() {

    val cachorro1 = Cachorro(nome = "Cleber", idade = 5, raca = "Pug", cor = "Caramelo")
    cachorro1.exibirinfos()
    cachorro1.emitirSom()
    cachorro1.correr()

    val cavalo1 = Cavalo(nome = "Xavier", idade = 10, cor = "Marrom" )
    cavalo1.exibirinfos()
    cavalo1.correr()
    cavalo1.emitirSom()

    val preguica1 = Preguica(nome = "José", idade = 12, cor = "Cinza")
    preguica1.subirArvore()
    preguica1.emitirSom()
}