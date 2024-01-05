


//fun reverseWord( word: String ): String {
//    val charArray = word.toCharArray()
//    for (i in 0 until charArray.size / 2){
//        val temp = charArray[i]
//        charArray[i] = charArray[charArray.size - 1 - i]
//        charArray[charArray.size - 1 - i] = temp
//    }
//return String(charArray)
//}
fun main(args: Array<String>) {
    var showMenu = true
    while (showMenu){
        println("Hello epta! koroche, choose your program \n1. Program to reverse any word that you input \n2.Program to sort array from lowest to greatest \n3. Program to do pochti the same huinya tolko vice versa \n4. program to draw sequence_1 \n5. program to draw sequence_2 \n6. console calculator naxui \n7. chislo iz fibonnaccccccci suka pedik naxui on ix sdelal pidaraz" )
        var prg = readln()


        when(prg) {
            "1" -> println("введите слово мистер пидор: ")


            "2" -> println("pawer naxuy javad!")
            "3" -> println("pawer naxuy shama!")
            "4" -> println("pawer naxuy mama!")
            "5" -> println("pawer naxuy papa!")
            "6" -> println("pawer naxuy shar!")





        }
        println("bazara net, hochesh druguyu pro gu vibrat? pishi 1 esli da i idi naxuy esli net")
       val answer = readln()

        val mneNadoMenushka = answer?.toIntOrNull()
        if (mneNadoMenushka != 1){
            showMenu = false
        }

    }

    fun reverseWord( word: String ): String {
        val charArray = word.toCharArray()
        for (i in 0 until charArray.size / 2){
            val temp = charArray[i]
            charArray[i] = charArray[charArray.size - 1 - i]
            charArray[charArray.size - 1 - i] = temp
        }
        return String(charArray)
    }
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}