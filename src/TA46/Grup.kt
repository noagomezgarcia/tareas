package TA46

class Grup(
    private var nom: String,
    private var tutor: Professor
) {
    private val llistaEstudiants = mutableListOf<Estudiant>()

    fun afegirEstudiant(estudiant: Estudiant) {
        llistaEstudiants.add(estudiant)
    }

    //nombre total d'aprovats
    fun numAprovats(): Int {
        return llistaEstudiants.count { it.getNotaFinal() >= 5.0 }
//        count actua com un comptador automàtic que s'incrementa per cada element que passa el filtre.
//        it.getNotaFinal() crida al mètode de cada estudiant per obtenir la seva qualificació.
//        >= 5.0: Filtra només aquells que compleixen el criteri d'aprovat definit a l'enunciat.
    }

    //llista només estudiants aprovats
    fun estudiantsAprovats(): List<Estudiant> {
        return llistaEstudiants.filter { it.getNotaFinal() >= 5.0 }
//        filter recorre la llistai avalua una condició per a cada element.
    }

    override fun toString(): String {
        var resultat = "TA46.Grup $nom amb tutor $tutor"
        resultat += "Llista d'alumnes:"
        //Recorre cada element de la llista d'estudiants i concatena la seva representació en text a la
        //variable resultat precedida d'un guionet.
        llistaEstudiants.forEach { resultat += "- ${it.toString()}" }
        return resultat
    }
}