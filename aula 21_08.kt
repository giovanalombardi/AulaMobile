import sun.net.util.IPAddressUtil.scan
import java.util.*

fun main(){
    val a = 2
    val b = 2

    val resultado = a + b
    println(resultado)

    var usuario = "Giovana Lombardi"
    var texto = "Boa noite $usuario, tudo bem?"
    println(texto)

    val texto2 = """ NÃO
                     SEI
                     QUE 
                     TEXTO 
                     ESCREVER
                  """
print(texto2)

    main2()
    main3()
    main4()
    main5()
}

fun main2(){
    val valor = arrayListOf(10,2,3,4,5,6,7,8,9,100).sum()
    val media = valor / 10
    println("a media dos valores -> $media")

    if (media <= 5){
        println("media é menor ou igual que 5")
    };if (media >= 5){
        println("media é maior que 5")
    };if (media == 0){
        println("media é igual a zero")
    };if (media >=10){
        println("media é maior ou igual a 10")
    }
}

fun main3(){
    numeros()
}


fun numeros(){
    for (i in 1..20)
        println("$i")
}


fun main4(){
    exSete()
}
fun exSete(){
    var maior = 0
    var num: Int

    for (i in 1..5){
        val scanner = Scanner(System.`in`).useLocale(Locale.US)
        println("Insira um numero: $i")
        num = scanner.nextInt()

        if (num > maior) {
            maior = num
        }
        print("o maior numero é: $maior")
    }
}

fun main5(){
    nota()
}
fun nota(){
    //pedir uma nota
    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira uma nota: ")
    var nota = scan.nextDouble()

    //caso o valor seja invalido
    do{
        var notaValida = false
        if(nota in 0.0..10.0){
            notaValida = true
            println("Nota valida: $nota")
        } else {
            println("Nota $nota invalida, tente novamente")
            println("Insira uma nota: ")
            nota = scan.nextDouble()
        }
        //continue pedindo ate ser valido
    } while (!notaValida)

}

//se a nota for 0 ate 4 = reprovado
//4 a 6 = recuperação
//maior ou igual a 6 = aprovado