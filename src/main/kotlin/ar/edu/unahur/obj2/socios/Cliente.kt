package ar.edu.unahur.obj2.socios

import kotlin.math.cos

class Cliente ( var estadoDeAnimo: EstadoDeAnimo, var plataEnElBolsillo : Int , var  barrio : Barrio , val propina: Propina ) {

fun simularPropina ( costoPedido: Int) : Int {
    return propina.calcularPropina( estadoDeAnimo, barrio, costoPedido )
}


}

class Propina ( var estadoDeAnimo: EstadoDeAnimo , var barrio: Barrio) {

    fun calcularPropina( estadoDeAnimo: EstadoDeAnimo , barrio: Barrio , costoPedido: Int) : Int {

        return barrio.calcularPropina(estadoDeAnimo.calcularPropina( costoPedido ))
    }

}

abstract class EstadoDeAnimo {

  //  abstract fun calcularPropina() : Int
    abstract fun calcularPropina( costoPedido: Int) : Int
}

class Enojado : EstadoDeAnimo (){

   override fun calcularPropina( costoPedido: Int ) :Int {
       return 0
   }

}

class Feliz : EstadoDeAnimo() {

    override fun calcularPropina( costoPedido: Int) :Int {
        return costoPedido * 25 / 100
    }
}

class Indiferente( var plataEnElBolsillo : Int) : EstadoDeAnimo(){

    override fun calcularPropina( costoPedido: Int ) :Int {
        return plataEnElBolsillo
    }
}

class Resfriado : EstadoDeAnimo (){

    override fun calcularPropina( costoPedido: Int ) :Int {
        return costoPedido * 100 / 100
    }
}

class Barrio {

fun calcularPropina( monto : Int) : Int{
    return 0
}

}