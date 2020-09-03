package br.digital.com.aulakotlinsemobjeto

fun main(){
    println("Hello World!!")
    println(meuNome("Yago", "Machado"))
    var lista = arrayListOf<String>()
    lista.add("primeiroItem")
    println(lista[0])
}

fun meuNome(nome: String, sobrenome: String) :String {
    return nome + sobrenome
}

