package ar.edu.unahur.obj2.socios

import kotlin.math.cos

class Cliente ( var estadoDeAnimo: EstadoDeAnimo, var plataEnElBolsillo : Int , var  barrio : Barrio  ) {

    fun simularPropina( costoPedido: Int ):Int {
        return barrio.calcularPropina(estadoDeAnimo.calcularPropina( costoPedido ))
    }

}

abstract class EstadoDeAnimo {

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

abstract  class Barrio {

abstract fun calcularPropina( monto : Int) : Int

}

class LasRosas : Barrio () {
    override fun calcularPropina(monto: Int): Int {
        return monto + 50
    }
}

class LasLauchas : Barrio () {
    override fun calcularPropina(monto: Int): Int {
        return monto / 2
    }
}


class BarrioVerde : Barrio () {
    override fun calcularPropina(monto: Int): Int {
        return monto + 200
    }
}

class LasTorres : Barrio () {
    override fun calcularPropina(monto: Int): Int {
        return monto
    }
}

object LasTorres2
{
    var a : Int =1
    var b : Int = 2

}