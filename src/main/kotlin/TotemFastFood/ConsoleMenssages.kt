package TotemFastFood

 object ConsoleMenssages{
    // Menus
   internal const val msgMenuprincipal = "\t-----------BEM VINDO AO FLASH FOOD!-----------" +
            "\n\tQual Item você deseja?: \n\t1- Lanches\n\t2- Bebidas\n\t3- Sobremesas "
   internal const val msgMenuLanches = "De Lanches, temos essas opções: \n\t1- X-Burger\n\t2- X-Salada\n\t3- Combo Solteiro I" +
            "\n\t4- Combo Solteiro II\n\t5- Combo Casal\n\t6- Combo Família"
   internal const val msgMenuBebidas = "De Bebidas, temos essas opções: \n\t1- Refrigerante\n\t2- Suco"
   internal const val msgMenuSobremesas = "De Sobremesas, temos essas opções: \n\t1- MilkShake\n\t2- Casquinha"
   internal const val opcInvalida = "Opção inválida, por favor, digite novamente: "
   internal const val msgExcecao = "Formato inválido, para escolher o item, você deve informar o número dele."
   internal const val pedeQuantidade = "Informe a quantidade do item escolhido: "
   internal const val msgMenuConfirmarPedido = "Informe a opção desejada: \n\t1- Adcionar mais itens\n\t2- Editar Carrinho" +
            "\n\t3- Remover Itens\n\t4- Finalizar Pedido\n\t5- Cancelar Pedido"
   internal const val verificarPagamento = "Por favor, informe o método de pagamento: \n\t1- Crédito\n\t2- Débito" +
            "\n\t3- Vale Refeição ou Alimentação\n\t4- Dinheiro"
   internal const val pedeCodigo = "Informe o código do Item: "
   internal const val codigoValido = "Informe um código válido: "
   internal const val pedeValorDinheiro = "Informe o valor a ser pago: "
   internal const val quantVAzia = "Quantidade para o item não pode ser vazia! Digite novamente: "
   internal const val listaVazia = "Seu carrinho está vazio! "

    // Classe Produto
   internal const val pedeNovaQuantidade = "Informe a nova quantidade do Produto: "
   internal const val carrinhoAtualizado = "------------------Segue seu carrinho atualizado-------------------"
   internal const val codNaoEncontrado = "Não consegui encontrar nenhum item para o código informado."
   internal const val removido = "Item removido com sucesso."

    const val pedido = "Pedido Realizado com sucesso! Número do pedido: "
    const val msgDeFinalizacao = "Aguarde, logo seu pedido ficará pronto! ;)"
    const val msgValorCliente = "O valor pago foi: "
    const val msgTroco = "Visualize seu troco: "
    const val valorInsuficiente = "Valor informado é insuficente para realizar o pagamento."
    const val pedidoCancelado = "Pedido Cancelado com Sucesso! "

    // Descrições dos Combos
   const val comboSolteiro1 = "Acompanha:\n\t1 X-Burguer\n\t1 Refrigerante"
   const val comboSolteiro2 = "Acompanha:\n\t1 X-Salada\n\t1 Suco"
   const val comboCasal = "Acompanha:\n\t2 X-Salada\n\t2 Refrigerantes"
   const val comboFamilia = "Acompanha:\n\t2 X-Salada\n\t2 X-Burguer\n\t3 Refrigerantes\n\t1 Suco"


}