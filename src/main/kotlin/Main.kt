


fun reverseWord( word: String ): String {
    val charArray = word.toCharArray()
    for (i in 0..<charArray.size / 2){
        val temp = charArray[i]
        charArray[i] = charArray[charArray.size - 1 - i]
        charArray[charArray.size - 1 - i] = temp
    }
    return String(charArray)
}

fun quickSort(array: IntArray, low: Int, high: Int, descending: Boolean = false) {
    if (low < high) {
        val pivotIndex = delitelArraya(array, low, high, descending)
        quickSort(array, low, pivotIndex - 1, descending)
        quickSort(array, pivotIndex + 1, high, descending)
    }
}

fun delitelArraya(array: IntArray, low: Int, high: Int, descending: Boolean = false): Int {
    val pivot = array[high]
    var i = low - 1

    for (j in low..<high) {
        val compareResult = if (descending) array[j] >= pivot else array[j] <= pivot

        if (compareResult) {
            i++
            pomenyashka(array, i, j)
        }
    }

    pomenyashka(array, i + 1, high)
    return i + 1
}

fun pomenyashka(array: IntArray, i: Int, j: Int) {
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp
}





    fun main(args: Array<String>) {
    var showMenu = true
    while (showMenu){

        println("Hello epta! koroche, choose your program ")
        println("1. Program to reverse any word that you input")
        println("2. Program to sort array from lowest to greatest i vice versa")
        println("3. program to draw sequence_1")
        println("4. program to draw sequence_2")
        println("5. console calculator naxui")
        println("6. chislo iz fibonnaccccccci suka pedik naxui on ix sdelal pidaraz")


        var program = readln()


        when(program) {

            "1" -> {

                println("vvedite slovo mister pider: ")

                val inputWord = readln()

                if (inputWord.isNotBlank()) {
                    val reversedWord = reverseWord(inputWord)
                    println("reversed word : $reversedWord")
                } else {
                    println("pashel naxuy.")
                }

            }
            "2" -> {

                print("Array razmer huini suda: ")
                val size = readlnOrNull()?.toIntOrNull()

                if (size != null && size > 0) {
                    val array = IntArray(size)


                    for (i in 0..<size) {

                        print("teper xuini element #$i: ")

                        array[i] = readlnOrNull()?.toIntOrNull() ?: 0
                    }

                    println("vo kakoy massiv vishel: ${array.joinToString()}")


                    quickSort(array, 0, size - 1, descending = false)

                    println("na suka svoy massiv takoy: ${array.joinToString()}")


                    quickSort(array, 0, size - 1, descending = true)

                    println("na suka svoy massiv sekoi: ${array.joinToString()}")
                } else {

                    println("govno.")

                }

            }

            "3" -> {println("vvedi kolichestvo strok v stai rse!")




            }
            "4" -> {println("pawer naxuy mama!")}
            "5" -> {println("pawer naxuy papa!")}
            "6" -> {println("pawer naxuy shar!")}





        }


        println("bazara net, hochesh druguyu pro gu vibrat? pishi 1 esli da i idi naxuy esli net")

       val answer = readln()


        if (answer != "1"){
            showMenu = false
        }

    }


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}