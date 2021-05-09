package ar.edu.unahur.obj2.socios

import kotlin.math.cos

enum class Animos{
    FELIZ,
    ENOJADO,
    INDIFERENTE,
    RESFRIADO
}


abstract class Cliente () {
    var estadoDeAnimo: Animos = Animos.INDIFERENTE
    var plataEnElBolsillo: Int = 0
    var miBarrio: Barrio = BarrioVerde()

    fun cambiarEstadoDeAnimo(nuevoEstado: Animos) {
        estadoDeAnimo = nuevoEstado
    }

    fun cambiarPlataDelBolsillo(masPlata: Int) {
        plataEnElBolsillo = masPlata
    }

    fun cambiarDeBarrio(nuevoBarrio: Barrio) {
        miBarrio = nuevoBarrio
    }

    fun simularPropinaPorEstado (costoPedido: Int): Int
    {
        return when (estadoDeAnimo) {
            Animos.FELIZ ->  costoPedido * 25 / 100
            Animos.ENOJADO -> 0
            Animos.INDIFERENTE -> plataEnElBolsillo
            Animos.RESFRIADO -> costoPedido
        }
    }

    fun propinaMasBarrio(costoPedido: Int) :Int {
        return miBarrio.calcularPropina( this.simularPropinaPorEstado(costoPedido) )
    }
}

abstract class Barrio {
   abstract fun calcularPropina( monto : Int) : Int
}

class LasRosas() : Barrio() {

    override fun calcularPropina(monto: Int): Int {
        return monto + 50
    }
}

class LasLauchas : Barrio() {

    override fun calcularPropina(monto: Int): Int {
        return (monto) / 2
    }
}

class LasTorres : Barrio() {

    override fun calcularPropina(monto: Int): Int {
        return (monto)
    }
}

class BarrioVerde:Barrio() {

    override fun calcularPropina(monto: Int): Int {
        return (monto) + 200
    }
}

// Objeto Singleton Cliente
object clienteSantiago: Cliente()
