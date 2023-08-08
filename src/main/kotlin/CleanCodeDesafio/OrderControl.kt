package CleanCodeDesafio

import TotemFastFood.ConsoleMenssages

class OrderControl {
    companion object{
        private var orderNumber = 499
        private fun generateNewOrder(){
            orderNumber++
            println(ConsoleMenssages.pedido)
        }

        fun finishOrderWithCard(){
            generateNewOrder()
            println(ConsoleMenssages.msgDeFinalizacao)
        }

        private fun finishOrderWithMoney(customerValue: Double){
            println("${ConsoleMenssages.msgTroco} R$ ${customerValue - ControlCart.totalValue}")
            generateNewOrder()
            println(ConsoleMenssages.msgDeFinalizacao)
        }

        fun validateCustomerValue(customerValue: Double){
            if (customerValue < ControlCart.totalValue){
                println(ConsoleMenssages.valorInsuficiente)
            }else{
                finishOrderWithMoney(customerValue)
            }

        }
    }
}