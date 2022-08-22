package Ex02

class Plane1 (

    var modelo: String,
    var capacidade: Int,
    var tipo: String

) {

    var limiteVoo: Double = 0.0

    constructor(

        modelo: String,
        capacidade: Int,
        tipo: String,
        limiteVoo: Double

    ): this(modelo, capacidade, tipo) {
        this.limiteVoo = limiteVoo
    }

    fun infoAviao(){
        println("O modelo do avião é: $modelo, a capacidade é: $capacidade, o tipo do avião é: $tipo com um limite de voo de $limiteVoo " )
    }
}