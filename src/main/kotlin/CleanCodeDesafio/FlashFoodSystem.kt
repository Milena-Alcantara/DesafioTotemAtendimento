package CleanCodeDesafio

import TotemFastFood.ConsoleMenssages

interface FlashFoodSystem {
    companion object{
        fun receiveInputs(): Int {
            println(ConsoleMenssages.msgMenuprincipal)
            return readln().toInt()
        }
        fun requestQuantity(): Int{
            println(ConsoleMenssages.pedeQuantidade)
            var quantidade =  readln().toIntOrNull() ?:0
            while (quantidade==0 || quantidade<0){
                println(ConsoleMenssages.quantVAzia)
                quantidade =  readln().toIntOrNull() ?:0
            }
            return quantidade
        }

        fun requestProductCode(): Int{
            println(ConsoleMenssages.pedeCodigo)
            var codigo = readln().toIntOrNull()
            while (codigo == null){
                println(ConsoleMenssages.codigoValido)
                codigo = readln().toIntOrNull()
            }
            return codigo
        }
        fun waitSystem(){
            Thread.sleep(3000)
        }
    }


}
