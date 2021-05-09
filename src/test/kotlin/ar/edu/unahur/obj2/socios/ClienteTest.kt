package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({

  describe("Unos clients") {
    it("Enojado") {
      var Juan = Cliente(Animos.ENOJADO,1000)

      Juan.simularPropina(200).shouldBe(0)
    }

    it("Feliz") {
      var Marcela = Cliente(Animos.FELIZ, 300)
      Marcela.simularPropina(3500).shouldBe(875)
    }

    it("Indiferente") {
      var Roberto = Cliente(Animos.INDIFERENTE, 700)
      Roberto.simularPropina(8765).shouldBe(700)
    }

    it("Resfriado") {
      var Santiago = Cliente(Animos.RESFRIADO, 450)
      Santiago.simularPropina(750).shouldBe(750)
    }
  }

  describe("Clientes de Barrio") {
    describe("Un/a cliente resfriado de las rosas") {


      var matias  = ClienteLasRosas(Animos.RESFRIADO,1000)

      matias.calcularPropina(1000).shouldBe(1050)


    }

    describe("Un/a cliente resfriado en las lauchas") {


      var matias  = ClienteLasLauchas(Animos.RESFRIADO,1000)

      matias.calcularPropina(1000).shouldBe(500)


    }

    describe("Un/a cliente feliz en las rosas") {



      var matias  = ClienteLasRosas(Animos.FELIZ,1000)

      matias.calcularPropina(1000).shouldBe(300)


    }

    describe("Un/a cliente indiferente en las torres") {

      var Carlos  = ClienteLasTorres(Animos.INDIFERENTE, 950)

      Carlos.calcularPropina(75000).shouldBe(950)


    }

    describe("Un/a cliente enojado en barrio verde") {
      var Carlos  = ClienteBarrioVerde(Animos.ENOJADO, 400)

      Carlos.calcularPropina(5460).shouldBe(200)
    }

  }


})
