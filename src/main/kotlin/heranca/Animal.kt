package heranca

open class Animal (
    val nome: String,
    val idade: Int,
        ){

    open fun emitirSom(){
        println("SOM")
    }
}