package TotemFastFood

open class Produto() {
   protected var nome: String = ""
   protected var cod: Int = 0
   protected var valorUnitario : Double = 0.0
   protected var quantidade = 0

    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade
    }

    companion object{
        private var codigoAtual = 0
        internal var produtos = mutableListOf<Produto>()
        private var numeroPedido = 499

        fun adicioarAoCarrinho(objeto: Produto,quantidade: Int): MutableList<Produto>{
            when (objeto) {
                is Xburguer -> {
                    codigoAtual = 99
                    codigoAtual++
                    produtos.add(Xburguer("X-Burguer",codigoAtual,10.00,quantidade))
                }

                is XSalada -> {
                    codigoAtual = 199
                    codigoAtual++
                    produtos.add(XSalada("X-Salada", codigoAtual,12.00,quantidade))
                }

                is Refrigerante -> {
                    codigoAtual = 299
                    codigoAtual++
                    produtos.add(Refrigerante("Refrigerante",codigoAtual,8.00,quantidade))
                }

                is Suco -> {
                    codigoAtual = 399
                    codigoAtual++
                    produtos.add(Suco("Suco",codigoAtual,6.00,quantidade))
                }
                is MilkShake->{
                    codigoAtual = 699
                    codigoAtual++
                    produtos.add(MilkShake("MilkShake", codigoAtual,15.00,quantidade))
                }
                is Casquinha->{
                    codigoAtual = 799
                    codigoAtual++
                    produtos.add(Casquinha("Casquinha", codigoAtual,5.00,quantidade))
                }
                is ComboSolteiro1->{
                    codigoAtual = 9
                    codigoAtual++
                    produtos.add(ComboSolteiro1("Combo Solteiro I", codigoAtual,30.00,quantidade,
                        ConsoleMenssages.comboSolteiro1))
                }
                is ComboSolteiro2->{
                    codigoAtual = 19
                    codigoAtual++
                    produtos.add(ComboSolteiro2("Combo Solteiro II", codigoAtual,30.00,quantidade,
                        ConsoleMenssages.comboSolteiro2))
                }
                is ComboCasal->{
                    codigoAtual = 29
                    codigoAtual++
                    produtos.add(ComboCasal("Combo Casal", codigoAtual,40.00,quantidade,
                        ConsoleMenssages.comboCasal))
                }
                is ComboFamilia->{
                    codigoAtual = 39
                    codigoAtual++
                    produtos.add(ComboFamilia("Combo Família", codigoAtual,60.00,quantidade,
                        ConsoleMenssages.comboFamilia))
                }
            }
            return produtos
        }

        fun editarItem(cod: Int?){
            for (item in produtos){
                if (item.cod.equals(cod)){
                    println(ConsoleMenssages.pedeNovaQuantidade)
                    item.quantidade = readln().toInt()
                    println(ConsoleMenssages.carrinhoAtualizado)
                    visualizarCarrinho(produtos)
                    return
                }
            }
            println(ConsoleMenssages.codNaoEncontrado)
        }
        fun removerItem(cod: Int?){
            for (item in produtos){
                if (item.cod.equals(cod)){
                   produtos.remove(item)
                    println(ConsoleMenssages.removido)
                   println(ConsoleMenssages.carrinhoAtualizado)
                   visualizarCarrinho(produtos)
                   return
                }
            }
            println(ConsoleMenssages.codNaoEncontrado)
        }
        fun finalizarPedidoCartao():Int{
                numeroPedido++
                println("${ConsoleMenssages.pedido} $numeroPedido")
                println(ConsoleMenssages.msgDeFinalizacao)
            return numeroPedido
        }
        fun finalizarPedidoDinheiro(valorCliente: Double,totalCarrinho: Double):Boolean{
            println("${ConsoleMenssages.msgValorCliente} R$ $valorCliente")
            if (valorCliente<totalCarrinho){
                println(ConsoleMenssages.valorInsuficiente)
                return false
            }
            println("${ConsoleMenssages.msgTroco} R$ ${valorCliente - totalCarrinho}")
            numeroPedido++
            println("${ConsoleMenssages.pedido} $numeroPedido")
            println(ConsoleMenssages.msgDeFinalizacao )
            return true
        }
        fun verificarCarririho(): Boolean{
            return !produtos.isEmpty()
        }
        fun limparCarrinho(){
            produtos.clear()
        }

        fun esperar(){
            Thread.sleep(3000)
        }

        fun visualizarCarrinho(carrinho: MutableList<Produto>): Double{
            var valorTotal = 0.0
            for ((indice,produto) in produtos.withIndex()){
                valorTotal += produto.valorUnitario * produto.quantidade
                println("${indice+1}º Produto \n\tNome: ${produto.nome}\n\tCód: ${produto.cod}\n\tValor: R$${produto.valorUnitario}" +
                        "\n\tUnidades: ${produto.quantidade} ")
                if (produto is Combos){
                    println("\t-----Descrição:------ \n\t${produto.descricao}")
                }
                println()
            }
            println("Valor Total: R$ $valorTotal")
            println()
            return valorTotal
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Produto

        return cod == other.cod
    }

    override fun hashCode(): Int {
        return cod
    }

}

