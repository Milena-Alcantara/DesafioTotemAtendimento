package TotemFastFood

class Xburguer():Produto(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade
    }
}

class XSalada():Produto(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade

    }
}

class Refrigerante():Produto(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade

    }
}

class Suco():Produto(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade

    }
}

class MilkShake():Produto(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade

    }
}
class Casquinha():Produto(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade

    }
}
open class Combos():Produto(){
    var descricao= ""
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int,descricao: String):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade
        this.descricao = descricao
    }
}
class ComboSolteiro1():Combos(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int,descricao: String):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade
        this.descricao = descricao
    }
}
class ComboSolteiro2():Combos(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int,descricao: String):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade
        this.descricao = descricao
    }
}
class ComboCasal():Combos(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int,descricao: String):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade
        this.descricao = descricao
    }
}
class ComboFamilia():Combos(){
    constructor( nome: String, cod: Int, valorUnitario:Double, quantidade: Int,descricao: String):this(){
        this.nome = nome
        this.cod = cod
        this.valorUnitario = valorUnitario
        this.quantidade = quantidade
        this.descricao = descricao
    }
}


