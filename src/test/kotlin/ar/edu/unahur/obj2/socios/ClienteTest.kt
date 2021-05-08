package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({

  describe("Un/a cliente") {


    var matias  = Cliente(Resfriado(),1000,LasLauchas(), Propina(Resfriado(),LasLauchas()))

    matias.simularPropina(1000).shouldBe(500)


  }

  describe("Un/a cliente resfriado en las lauchas") {


    var matias  = Cliente(Resfriado(),1000,LasLauchas(), Propina(Resfriado(),LasLauchas()))

    matias.simularPropina(1000).shouldBe(500)


  }

  describe("Un/a cliente feliz en las rosas") {


    var matias  = Cliente(Feliz(),1000,LasRosas(), Propina(Feliz(),LasRosas()))

    //25% sobre el pedido + 50 de fijo  = 300
    matias.simularPropina(1000).shouldBe(300)


  }

  describe("Un/a cliente indiferente en las torres") {


    var matias  = Cliente(Indiferente(1000),1000,LasTorres(), Propina(Indiferente(1000),LasTorres()))

    //da lo que tenga en el bolsillo + no modifica el barrio   = 1000
    matias.simularPropina(1000).shouldBe(1000)


  }

  describe("Un/a cliente enojado en barrio verde") {


    var matias  = Cliente(Enojado(),1000,BarrioVerde(), Propina(Enojado(),BarrioVerde()))

    //no da propina + 200 minimo por el barrio   = 1000
    matias.simularPropina(1000).shouldBe(200)


  }


})
