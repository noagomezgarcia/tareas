package TA46

class Estudiant(
    private var dni: String,
    private var nom: String,
    private var cognoms: String,
    private var notaFinal: Double
) {
    fun getNotaFinal() = notaFinal
    fun setNotaFinal(nota: Double) { notaFinal = nota }

    override fun toString(): String {
        return "DNI: $dni | Nom: $nom $cognoms | Nota: $notaFinal"
    }
}