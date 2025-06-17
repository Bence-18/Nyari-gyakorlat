fun print(szam: Float, ch: Char) {}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a_nevem: String = "Király"
    println("Az én nevem" + a_nevem)
    var szam: Float = 2f
    var szam_2: Float = 10f
    println("${szam} + ${szam_2} = ${szam + szam_2}")
    println("${szam} - ${szam_2} = ${szam - szam_2}")
    println("${szam} * ${szam_2} = ${szam * szam_2}")
    println("${szam} / ${szam_2} = ${szam / szam_2}")
    print("Irjal valamit")
    var bekert_szoveg = readln()
    if (bekert_szoveg.isEmpty()) {
        println("MIT MONDTAM?")
    if (!bekert_szoveg.isEmpty())
        println(bekert_szoveg)
    }
}
