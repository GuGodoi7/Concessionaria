data class ConcessionariaCarro(
    override var nome: String,
    override val endereco: String,
    override val telefone: String
): Concessionaria(nome, endereco, telefone) {
    val lista = super.lisCarro
}