package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({

  describe("Unos clients") {
    it("Enojado") {
      var Juan = Cliente(Animos.ENOJADO,1000, LasRosas())

      Juan.simularPropinaPorEstado(200).shouldBe(0)
    }

    it("Feliz") {
      var Marcela = Cliente(Animos.FELIZ, 300, LasRosas())
      Marcela.simularPropinaPorEstado(3500).shouldBe(875)
    }

    it("Indiferente") {
      var Roberto = Cliente(Animos.INDIFERENTE, 700, LasRosas())
      Roberto.simularPropinaPorEstado(8765).shouldBe(700)
    }

    it("Resfriado") {
      var Santiago = Cliente(Animos.RESFRIADO, 450, LasRosas())
      Santiago.simularPropinaPorEstado(750).shouldBe(750)
    }
  }

  describe("Clientes de Barrio") {
    describe("Un/a cliente resfriado de las rosas") {

      var matias  = Cliente(Animos.RESFRIADO,1000, LasRosas())

      matias.propinaMasBarrio(1000).shouldBe(1050)

    }

    describe("Un/a cliente resfriado en las lauchas") {

      var matias  = Cliente(Animos.RESFRIADO,1000, LasLauchas())

      matias.propinaMasBarrio(1000).shouldBe(500)

    }

    describe("Un/a cliente feliz en las rosas") {

      var matias  = Cliente(Animos.FELIZ,1000, LasRosas())

      matias.propinaMasBarrio(1000).shouldBe(300)
    }

    describe("Un/a cliente indiferente en las torres") {

      var Carlos  = Cliente(Animos.INDIFERENTE, 950, LasTorres())

      Carlos.propinaMasBarrio(75000).shouldBe(950)

      Carlos.cambiarDeBarrio(LasRosas())

      Carlos.propinaMasBarrio(75000).shouldBe(1000)

    }

    describe("Un/a cliente enojado en barrio verde") {
      var Carlos  = Cliente(Animos.ENOJADO, 400, BarrioVerde())

      Carlos.propinaMasBarrio(5460).shouldBe(200)
    }

  }


})
