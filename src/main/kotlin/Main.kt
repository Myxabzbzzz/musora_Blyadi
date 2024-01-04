


fun reverseWord(){
    val word = readln()


}
fun main(args: Array<String>) {
    println("Hello epta! koroche, choose your program \n1. Program to reverse any word that you input \n2.Program to sort array from lowest to greatest \n3. Program to do pochti the same huinya tolko vice versa \n4. program to draw sequence_1 \n5. program to draw sequence_2 \n6. console calculator naxui \n7. chislo iz fibonnaccccccci suka pedik naxui on ix sdelal pidaraz" )
    var prg = readln()

    when(prg) {

        "1" -> println("pawer naxuy shadiev!")
        "2" -> println("pawer naxuy javad!")
        "3" -> println("pawer naxuy shama!")
        "4" -> println("pawer naxuy mama!")
        "5" -> println("pawer naxuy papa!")
        "6" -> println("pawer naxuy shar!")


    }


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}