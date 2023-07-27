
import TotemFastFood.Produto
import TotemFastFood.Xburguer
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ProdutoTest {
    val xburguer = Xburguer("Xburger", 201, 10.00, 0)
    @Test
    fun deveRetornarConfirmacaoDeAdcionadoAoCarrinho(){
        val verificacao = Produto.adicioarAoCarrinho(xburguer, 2)
        assertEquals(Produto.produtos, verificacao)
    }

   @Test
   fun deveRetornarNumeroDoPedido(){
       val pedido = Produto.finalizarPedidoCartao()
       assertEquals(500,pedido)
   }
    @Test
  fun deveConseguirFazerPagamentoEmDinheiro(){
      val pagamento = Produto.finalizarPedidoDinheiro(20.00,15.00)
      assertEquals(true,pagamento)
  }
    @Test
    fun naoDeveConseguirFazerPagamentoEmDinheiro(){
        val pagamento = Produto.finalizarPedidoDinheiro(15.00,20.00)
        assertEquals(false,pagamento)
    }
    @Test
    fun deveRetornarValorTotal(){
        Produto.adicioarAoCarrinho(xburguer, 2)
        val valorTotal = Produto.visualizarCarrinho(Produto.produtos)
        assertEquals(40.00,valorTotal)
    }


}