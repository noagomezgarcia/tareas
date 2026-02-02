fun main() {

    val grup = crearGrup()

    gestionarEntradaAlumnes(grup)

    mostrarResultats(grup)
}

/**
 * Funció per gestionar la petició de dades per crear el grup i el professor inicial
 *
 */
fun crearGrup(): Grup {
    print("Introdueix el nom del grup: ")
    val nomGrup = readLine() ?: ""

    println("INtrodueix les dades del tutor: ")
    print("Nom: ")
    val nomProf = readLine() ?: ""
    print("Cognom: ")
    val cogProf = readLine() ?: ""
    print("Formació: ")
    val formProf = readLine() ?: ""

    val tutor = Professor(nomProf, cogProf, formProf)
    return Grup(nomGrup, tutor)
}

/**
 * Bucle per demanar dades d'alumnes i afegir-los al grup
 */
fun gestionarEntradaAlumnes(grup: Grup) {
    var afegirMes: String
    do {
        println("Introdueix les dades de l'alumne: ")
        print("DNI: ")
        val dni = readLine() ?: ""
        print("Nom: ")
        val nom = readLine() ?: ""
        print("Cognoms: ")
        val cognoms = readLine() ?: ""
        print("Nota Final: ")
        val nota = readLine()?.toDoubleOrNull() ?: 0.0

        val nouEstudiant = Estudiant(dni, nom, cognoms, nota)
        grup.afegirEstudiant(nouEstudiant)

        print("Vols afegir un altre alumne? (s/n): ")
        afegirMes = readLine()?.lowercase() ?: "n"
    } while (afegirMes == "s")
}

/**
 * Mostra la informació final requerida per l'exercici
 */
fun mostrarResultats(grup: Grup) {
    println(grup.toString())

    println("Nombre total d'aprovats: ${grup.numAprovats()}")

    println("Llista detallada d'aprovats: ")
    val aprovats = grup.estudiantsAprovats()

    if (aprovats.isEmpty()) {
        println("No hi ha cap alumne aprovat.")
    } else {
        aprovats.forEach { println(it) }
    }
}