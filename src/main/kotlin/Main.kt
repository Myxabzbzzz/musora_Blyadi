import kotlin.math.pow



fun reverseWord(word: String): String {


    val charArray = word.toCharArray()


    for (i in 0..<charArray.size / 2) {

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


fun plusMinusUmnojitDelit(operation: Int) {

    print("birinchi chislo: ")
    val num1 = readlnOrNull()?.toDoubleOrNull()

    print("ikkinchi chislo: ")
    val num2 = readlnOrNull()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {

        when (operation) {

            1 -> println("result: ${num1 + num2}")

            2 -> println("result: ${num1 - num2}")

            3 -> println("result: ${num1 * num2}")

            4 -> {
                if (num2 != 0.0) {

                    println("result: ${num1 / num2}")

                } else {

                    println("ya sha tebya na nol podelyu chort.")

                }
            }
        }
    } else {

        println("kak pedik pishesh.")

    }
}

fun procent() {

    print("birinchi chislo: ")
    val num1 = readlnOrNull()?.toDoubleOrNull()


    print("ikkinchi chislo: ")
    val num2 = readlnOrNull()?.toDoubleOrNull()


    if (num1 != null && num2 != null) {

        if (num2 != 0.0) {
            println("result: ${num1 % num2}")
        } else {
            println("ya sha tebya na nol podelyu chort.")
        }


    } else {
        println("kak pedik pishesh.")
    }
}

fun ostepen() {

    print("birinchi chislo: ")
    val base = readlnOrNull()?.toDoubleOrNull()

    print("ikkinchi chislo: ")
    val exponent = readlnOrNull()?.toDoubleOrNull()

    if (base != null && exponent != null) {
        println("result: ${base.pow(exponent)}")
    } else {
        println("kak pedik pishesh.")
    }

}

fun factorial() {

    print("faktorial xochesh? pishi chislo: ")
    val num = readlnOrNull()?.toIntOrNull()

    if (num != null && num >= 0) {

        var factorial = 1

        for (i in 1..num) {
            factorial *= i
        }

        println("vot tebe suka tvoi factorial $num: $factorial")
    } else {
        println("pawel naxuy pishi normalno eban.")
    }

    fun main() {

        var showMenu = true
        while (showMenu) {

            println("Hello epta! koroche, choose your program ")
            println("1. Program to reverse any word that you input")
            println("2. Program to sort array from lowest to greatest i vice versa")
            println("3. program to draw sequence_1")
            println("4. program to draw sequence_2")
            println("5. console calculator naxui")
            println("6. chislo iz fibonnaccccccci suka pedik naxui on ix sdelal pidaraz")

            val program = readln()

            when (program) {
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

                "3" -> {
                    print("skolko zvezd-pyozd tebe nado?: ")

                    val size = readlnOrNull()?.toIntOrNull() ?: 0

                    for (i in 1..size) {

                        for (j in 0..<i) {

                            print("*")

                        }

                        println()

                    }
                }

                "4" -> {

                    print("skolko zvezd-pyozd tebe nado?: ")

                    val size = readlnOrNull()?.toIntOrNull() ?: 0

                    for (i in size downTo 1) {

                        for (j in 0..<i) {
                            print("*")

                        }

                        println()

                    }
                }

                "5" -> {

                    while (true) {

                        println("che xochesh?:")
                        println("1. pulus")
                        println("2. minus")
                        println("3. umnojeniye")
                        println("4. deleniye")
                        println("5. deleniye na percent")
                        println("6. power to chtoto")
                        println("7. factorial")
                        println("0. viyti v druguyu menushka")
                        print("vibirai: ")

                        when (val choice = readlnOrNull()?.toIntOrNull()) {

                            0 -> {

                                println("sha verneshsa bratishka.")
                                break

                            }

                            in 1..4 -> choice?.let { plusMinusUmnojitDelit(it) }
                            5 -> procent()
                            6 -> ostepen()
                            7 -> factorial()
                            else -> println("pawel naxuy pishi kak chelovek.")
                        }

                        println()
                    }
                }

                "6" -> println("pawer naxuy shar!")
            }
            println("bazara net, hochesh druguyu pro gu vibrat? pishi 1 esli da i idi naxuy esli net")

            val answer = readln()

            if (answer != "1") {

                showMenu = false
            }
        }
    }
}







