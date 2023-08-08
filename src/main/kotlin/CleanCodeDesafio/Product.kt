package CleanCodeDesafio


abstract class Product(){
    internal var name: String = ""
    internal var code: Int = 0
    internal var unitaryValue : Double = 0.0
    internal var quantity = 0
    internal var description = ""

    open fun showProductWhithoutDescripiton(product: Product){
        println("Nome: ${product.name}\n\tCód: ${product.code}\n\tValor: R$${product.unitaryValue}" +
        "\n\tUnidades: ${product.quantity} ")
    }

    open fun showProductWhithDescripiton(product: Product){
        println("Nome: ${product.name}\n\tCód: ${product.code}\n\tValor: R$${product.unitaryValue}" +
                "\n\tUnidades: ${product.quantity} ")
        println("\t-----Descrição:------ \n\t${product.description}")
    }

}
class Xburguer(): Product(){
    constructor(name: String = "X-Burguer" ,code : Int = 0, unitaryValue:Double = 10.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
    }
}

class XSalada(): Product(){
    constructor(name: String = "X-Salada", code : Int = 0, unitaryValue:Double = 12.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
    }
}
class Refrigerator():Product(){
    constructor(name: String = "Refrigerante", code : Int = 0, unitaryValue:Double = 8.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
    }
}
class Juice():Product(){
    constructor(name: String = "Suco", code : Int = 0, unitaryValue:Double = 6.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
    }
}
class MilkShake():Product(){
    constructor(name: String = "MilkShake", code : Int = 0, unitaryValue:Double = 15.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
    }
}
class IceCream():Product(){
    constructor(name: String = "Casquinha", code : Int = 0, unitaryValue:Double = 5.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
    }
}
abstract class Combinations(): Product(){}
class CombnationOne(): Combinations(){
    constructor(name: String = "Combo Solteiro I", code : Int = 0, unitaryValue:Double = 30.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
        this.description = ConsoleMenssages.comboSolteiro1
    }

}
class CombnationTwo(): Product(){
    constructor(name: String = "Combo Solteiro II", code : Int = 0, unitaryValue:Double = 30.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
        this.description = ConsoleMenssages.comboSolteiro2
    }
}
class CombnationThree(): Product(){
    constructor(name: String = "Combo Casal", code : Int = 0, unitaryValue:Double = 40.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
        this.description = ConsoleMenssages.comboCasal
    }
}
class CombnationFour(): Product(){
    constructor(name: String = "Combo Família", code : Int = 0, unitaryValue:Double = 60.00, quantity: Int): this(){
        this.name = name
        this.code = code
        this.unitaryValue = unitaryValue
        this.quantity = quantity
        this.description = ConsoleMenssages.comboFamilia
    }
}





