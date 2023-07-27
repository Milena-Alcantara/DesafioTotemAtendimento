package TotemFastFood

import kotlin.NumberFormatException

class Menus {
    fun menuPrincipal(){
        do {
            var opc = 0
            try {
                println(ConsoleMenssages.msgMenuprincipal)
                var opc = readln().toInt()

                when(opc){
                    1->{menuLanches()
                        menuConfirmarPedido()}
                    2-> {menuBebidas()
                    menuConfirmarPedido()}
                    3->{menuSobremesas()
                    menuConfirmarPedido()}
                    else->{ println(ConsoleMenssages.opcInvalida) }
                }
            }catch (erro1: NumberFormatException){
                erro1.printStackTrace()
                println(ConsoleMenssages.msgExcecao)
            }

        }while (opc !in 1..2)

    }
    fun menuLanches(){
        do {
            var opc = 0
            try {
                println(ConsoleMenssages.msgMenuLanches)
                opc = readln().toInt()

                when(opc){
                    1->{
                        println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = Xburguer()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    2->{
                        println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = XSalada()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    3->{println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = ComboSolteiro1()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    4->{
                        println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = ComboSolteiro2()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    5->{
                        println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = ComboCasal()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    6->{
                        println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = ComboFamilia()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    else ->{ println(ConsoleMenssages.opcInvalida)}
                }
            }catch (erro1: NumberFormatException) {
                erro1.printStackTrace()
                println(ConsoleMenssages.msgExcecao)
            }
        }while (opc !in 1..6)
    }
    fun menuBebidas(){
        do {
            var opc = 0
            try {
                println(ConsoleMenssages.msgMenuBebidas)
                opc = readln().toInt()

                when(opc){
                    1->{
                        println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = Refrigerante()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    2->{
                        println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = Suco()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    else->{println(ConsoleMenssages.opcInvalida)}
                }

            }catch (erro1: NumberFormatException) {
                erro1.printStackTrace()
                println(ConsoleMenssages.msgExcecao)
            }
        }while (opc !in 1..2)
    }
    fun menuSobremesas(){
        do {
            var opc = 0
            try {
                println(ConsoleMenssages.msgMenuSobremesas)
                opc = readln().toInt()
                when(opc){
                    1->{
                        println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = MilkShake()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    2->{
                        println(ConsoleMenssages.pedeQuantidade)
                        var quantidade =  readln().toIntOrNull() ?:0
                        while (quantidade==0 || quantidade<0){
                            println(ConsoleMenssages.quantVAzia)
                            quantidade =  readln().toIntOrNull() ?:0
                        }
                        var novoObjeto = Casquinha()
                        Produto.adicioarAoCarrinho(novoObjeto,quantidade)
                        Produto.visualizarCarrinho(Produto.produtos)
                    }
                    else->{println(ConsoleMenssages.opcInvalida)}
                }
            }catch (erro1: NumberFormatException) {
                erro1.printStackTrace()
                println(ConsoleMenssages.msgExcecao)
            }
        }while (opc !in 1..2)
    }

    fun menuConfirmarPedido(){
        do {
            var opc = 0
            try {
                println(ConsoleMenssages.msgMenuConfirmarPedido)
                opc = readln().toInt()

                when(opc){
                    1->{menuPrincipal()}
                    2-> {
                        println(ConsoleMenssages.pedeCodigo)
                        var codigo = readln().toIntOrNull()
                        while (codigo == null){
                            println(ConsoleMenssages.codigoValido)
                            codigo = readln().toIntOrNull()
                        }
                       println(Produto.editarItem(codigo))
                       menuConfirmarPedido()
                    }
                    3-> {
                        println(ConsoleMenssages.pedeCodigo)
                        var codigo = readln().toIntOrNull()
                        while (codigo == null){
                            println(ConsoleMenssages.codigoValido)
                            codigo = readln().toIntOrNull()
                        }
                        Produto.removerItem(codigo)
                        menuConfirmarPedido()
                    }
                    4-> {
                        println(ConsoleMenssages.verificarPagamento)
                        verificarPagamento(readln().toInt())
                        menuPrincipal()
                    }
                    5->{
                        println(ConsoleMenssages.pedidoCancelado)
                        Produto.limparCarrinho()
                        Produto.esperar()
                        println()
                        menuPrincipal()
                    }
                    else-> println(ConsoleMenssages.opcInvalida)
                }

            }catch (erro1: NumberFormatException) {
                erro1.printStackTrace()
                println(ConsoleMenssages.msgExcecao)
            }
        }while (opc !in 1..2)

    }
    fun verificarPagamento(opc: Int){
        do {
            try {
                when(opc){
                    1,2,3->{
                        if(Produto.verificarCarririho()){
                            Produto.visualizarCarrinho(Produto.produtos)
                            Produto.finalizarPedidoCartao()
                            Produto.limparCarrinho()
                            Produto.esperar()
                            println()
                            menuPrincipal()
                        }else{
                            println(ConsoleMenssages.listaVazia)
                            menuPrincipal()
                        }

                    }
                    4->{
                        if (Produto.verificarCarririho()){
                            println(ConsoleMenssages.pedeValorDinheiro)
                            var valorCliente = readln().toDoubleOrNull() ?:0.0
                            if (!Produto.finalizarPedidoDinheiro(valorCliente,Produto.visualizarCarrinho(Produto.produtos))){
                                println(ConsoleMenssages.verificarPagamento)
                                verificarPagamento(readln().toInt())
                                Produto.limparCarrinho()
                                Produto.esperar()
                                println()
                                menuPrincipal()
                            }
                        }else{
                            println(ConsoleMenssages.listaVazia)
                            menuPrincipal()
                        }

                    }
                    else->{
                        println(ConsoleMenssages.opcInvalida)}
                }
            }catch (erro1: NumberFormatException) {
                erro1.printStackTrace()
                println(ConsoleMenssages.msgExcecao)
        }

    }while (opc !in 1..4 )
}}
