package br.digital.com.aulakotlinsemobjeto

fun main() {
    println("Hello World!!")
}

fun oMaior(numero1: Int, numero2: Int, numero3: Int ) :Int {
    if (numero1>numero2 && numero1>numero3) {
        return numero1
    } else if (numero2>numero1 && numero2>numero3) {
        return numero2
    }
    return numero3
}

fun eDiferente(palavra1: String, palavra2: String) :Boolean {
    return palavra1 == palavra2
}

fun ePar(numero: Int) :Boolean {
    return numero%2==0
}

fun impares() {
    for (num in 1..100){
        if(num%2==1) {
            print("$num, ")
        }
    }
}

fun inteiros(numA: Int, numB: Int, numC: Int, numD: Int) :Boolean {
    return (numA>numC && numA>numD) || (numB>numC && numB>numD)
}

fun pares() {
    for (num in 1..100){
    if(num%2==0) {
        print("$num, ")
    }
}
}
