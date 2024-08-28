fun main() {
    var nome = "João Pedro"
    var nome2 = "Giovana"
    print("Giovana Ribeiro Lombardi")
    print("Olá $nome")
    print("Aula Dev Mobile")
    println("$nome2 é namorada do ${nome}")
    println("$nome faz faculdade de ri em bauru")
    familia()
    cpfs()
    ex05()
    erro()
    erro2()
}

fun familia() {
    var nome:String = "Ana Clara"
    var nome2:String = "João Victor"
    var nome3:String = "Giovana"
    var nome4:String = "João Pedro"
    println("$nome é namorada do $nome2")
    print("$nome é irma da $nome3 que namora o $nome4")
    print("$nome2 não namora a $nome3, ela namora outro joão")
    print("$nome3 e $nome namoram pessoas com o mesmo nome")
}

fun cpfs() {
    var cpf:Long = 42943389897
    print("meu cpf é: $cpf")
    cpf = 42943389898
    println("Meu novo cpf é: $cpf")
}

fun ex05() {
    var s: Any = "Giovana"
    println(s as String)
    println(s as? Int)
    if (s is String) {
        println("$s é uma string")
    }
}

fun erro(){
    var nome = "Giovana"
    println("Ola $nome")
    //nome = null da erro
}

fun erro2(){
    var nome:String? = "Giovana"
    println("Ola $nome")
    nome = null //OK
    println("Ola $nome")
}



