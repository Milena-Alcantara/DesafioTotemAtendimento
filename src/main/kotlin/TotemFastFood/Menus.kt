package TotemFastFood

import CleanCodeDesafio.*
import CleanCodeDesafio.ControlCart.Companion.addToCart
import CleanCodeDesafio.ControlCart.Companion.checkCart
import CleanCodeDesafio.ControlCart.Companion.clearCart
import CleanCodeDesafio.ControlCart.Companion.editItemInCart
import CleanCodeDesafio.ControlCart.Companion.removeItemInCart
import CleanCodeDesafio.ControlCart.Companion.showCart
import CleanCodeDesafio.FlashFoodSystem.Companion.receiveInputs
import CleanCodeDesafio.FlashFoodSystem.Companion.requestProductCode
import CleanCodeDesafio.FlashFoodSystem.Companion.requestQuantity
import CleanCodeDesafio.FlashFoodSystem.Companion.waitSystem
import CleanCodeDesafio.MilkShake
import CleanCodeDesafio.OrderControl.Companion.finishOrderWithCard
import CleanCodeDesafio.OrderControl.Companion.validateCustomerValue
import CleanCodeDesafio.XSalada
import CleanCodeDesafio.Xburguer
import kotlin.NumberFormatException

class Menus {
    fun menuPrincipal(){
        do {
            var opc = 0
            try {
                opc = receiveInputs()
                when(opc){
                    1->{menuLanches()
                        menuConfirmarPedido()}
                    2-> {menuBebidas()
                    menuConfirmarPedido()}
                    3->{menuSobremesas()
                    menuConfirmarPedido()}
                    else->{ println(ConsoleMenssages.opcInvalida) }
                }            }catch (erro1: NumberFormatException){
                erro1.printStackTrace()
                println(ConsoleMenssages.msgExcecao)
            }

        }while (opc !in 1..2)

    }
    private fun menuLanches(){
        do {
            var opc = 0
            try {
                println(ConsoleMenssages.msgMenuLanches)
                opc = readln().toInt()

                when(opc){
                    1->{
                        var newObject = Xburguer(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
                    }
                    2->{
                        var newObject = XSalada(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
                    }
                    3->{
                        var newObject = CombnationOne(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
                    }
                    4->{
                        var newObject = CombnationTwo(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
                    }
                    5->{
                        var newObject = CombnationThree(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
                    }
                    6->{
                        var newObject = CombnationFour(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
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
                        var newObject = Refrigerator(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
                    }
                    2->{
                        var newObject = Juice(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
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
                        var newObject = MilkShake(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
                    }
                    2->{
                        var newObject = IceCream(quantity = requestQuantity())
                        addToCart(newObject)
                        showCart()
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
                       editItemInCart(requestProductCode(), requestQuantity())
                        showCart()
                       menuConfirmarPedido()
                    }
                    3-> {
                        removeItemInCart(requestProductCode())
                        showCart()
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
                        if(checkCart()){
                            showCart()
                            finishOrderWithCard()
                            clearCart()
                            waitSystem()
                            println()
                            menuPrincipal()
                        }else{
                            println(ConsoleMenssages.listaVazia)
                            menuPrincipal()
                        }

                    }
                    4->{
                        if (checkCart()){
                            println(ConsoleMenssages.pedeValorDinheiro)
                            var valorCliente = readln().toDoubleOrNull() ?:0.0
                            validateCustomerValue(valorCliente)
                                Produto.limparCarrinho()
                                Produto.esperar()
                                println()
                                menuPrincipal()

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
