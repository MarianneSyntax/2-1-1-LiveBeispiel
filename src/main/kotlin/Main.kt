fun main() {
    println("Hello World!")

    // kompilierfehler:
    //val x: Int = "Hallo" // Fehler: Typenunverträglichkeit
    //println(x)

    // laufzeitfehler:
    //val numbersList = listOf(1,2,3)
   // println(numbersList[4])

    // Beispiel: User Input aus der Konsole lesen und weiter verwenden
    println("Hi, gib bitte deinen Namen ein:")
    var name = readln()
    println("Hallo, $name. Wie geht's dir?")

}
