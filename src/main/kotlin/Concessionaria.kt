open class Concessionaria (
    open var nome: String = "Celtcar",
    open val endereco: String?,
    open val telefone: String? = "11 12346789"
) {
    val listaMotos: ArrayList<String>? = arrayListOf()
    val lisCarro: ArrayList<String>? = arrayListOf()
}