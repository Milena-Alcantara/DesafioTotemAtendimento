package CleanCodeDesafio

import TotemFastFood.ConsoleMenssages

class ControlCart {
    companion object{
        private var productCart = mutableListOf<Product>()
        internal var totalValue = 0.0
        private var initialCode = 99

        fun addToCart(product: Product){
            initialCode++
            product.code = initialCode
            productCart.add(product)
        }

        fun showCart(){
            for (item in productCart){
                if (item is Combinations){
                    item.showProductWhithDescripiton(item)
                }
                item.showProductWhithoutDescripiton(item)
                println()
            }
            println("${ConsoleMenssages.valorTotal} ${calculateTotalCartValue()}" )
        }
        fun editItemInCart(code: Int, newQuantity: Int){
            for (item in productCart){
                if (item.code.equals(code)){
                    item.quantity = newQuantity
                    return
                }
            }
            println(ConsoleMenssages.codNaoEncontrado)
        }

        fun removeItemInCart(code: Int){
            for (item in productCart){
                if (item.code.equals(code)){
                    productCart.remove(item)
                    println(ConsoleMenssages.removido)
                    return
                }
            }
            println(ConsoleMenssages.codNaoEncontrado)
    }
        private fun calculateTotalCartValue(): Double{
            for (item in productCart){
                totalValue += item.unitaryValue *item.quantity
            }
             return totalValue
        }
        fun checkCart(): Boolean{
            return this.productCart.isNotEmpty()
        }

        fun clearCart(){
            productCart.clear()
        }
}
}