package digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
        Salario com Auxilio: ${calculoAuxilio() + salario}
    """.trimIndent()
}