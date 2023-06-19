fun main() {
    println("Hello World!")

    // kompilierfehler:
    //val x: Int = "Hallo" // Fehler: Typenunverträglichkeit
    //println(x)

    // laufzeitfehler:
    val numbersList = listOf(1,2,3)
    println(numbersList[4])
}
