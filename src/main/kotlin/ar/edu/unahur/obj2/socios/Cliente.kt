package ar.edu.unahur.obj2.socios

import kotlin.math.cos

enum class Animos{
    FELIZ,
    ENOJADO,
    INDIFERENTE,
    RESFRIADO
}


open class Cliente ( var estadoDeAnimo: Animos, var plataEnElBolsillo : Int ) {


    fun simularPropina (costoPedido: Int): Int
    {
        return when (estadoDeAnimo) {
            Animos.FELIZ -> costoPedido * 25 / 100
            Animos.ENOJADO -> 0
            Animos.INDIFERENTE -> plataEnElBolsillo
            Animos.RESFRIADO -> costoPedido
        }
    }
}

interface Barrio {
   fun calcularPropina( monto : Int) : Int
}

class ClienteLasRosas(estadoDeAnimo: Animos, plataEnElBolsillo: Int) : Cliente (estadoDeAnimo, plataEnElBolsillo), Barrio {

    override fun calcularPropina(monto: Int): Int {
        return this.simularPropina(monto) + 50
    }
}

class ClienteLasLauchas(estadoDeAnimo: Animos, plataEnElBolsillo: Int) : Cliente (estadoDeAnimo, plataEnElBolsillo), Barrio {

    override fun calcularPropina(monto: Int): Int {
        return this.simularPropina(monto) / 2
    }
}

class ClienteLasTorres(estadoDeAnimo: Animos, plataEnElBolsillo: Int) : Cliente (estadoDeAnimo, plataEnElBolsillo), Barrio {

    override fun calcularPropina(monto: Int): Int {
        return this.simularPropina(monto)
    }
}

class ClienteBarrioVerde(estadoDeAnimo: Animos, plataEnElBolsillo: Int) : Cliente (estadoDeAnimo, plataEnElBolsillo), Barrio {

    override fun calcularPropina(monto: Int): Int {
        return this.simularPropina(monto) + 200
    }
}
