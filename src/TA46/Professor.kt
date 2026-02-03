package TA46

class Professor(
    private var nom: String,
    private var cognoms: String,
    private var formacio: String
) {
    override fun toString(): String {
        return "$nom $cognoms ($formacio)"
    }
}