package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import java.security.acl.LastOwnerException

class ClienteTest : DescribeSpec({



  describe("Unos clients") {

    it("Enojado") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.ENOJADO)
      clienteSantiago.cambiarPlataDelBolsillo(1000)

      clienteSantiago.simularPropinaPorEstado(200).shouldBe(0)
    }

    it("Feliz") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.FELIZ)
      clienteSantiago.cambiarPlataDelBolsillo(300)

      clienteSantiago.simularPropinaPorEstado(3500).shouldBe(875)
    }

    it("Indiferente") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.INDIFERENTE)
      clienteSantiago.cambiarPlataDelBolsillo(700)

      clienteSantiago.simularPropinaPorEstado(8765).shouldBe(700)
    }

    it("Resfriado") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.RESFRIADO)
      clienteSantiago.cambiarPlataDelBolsillo(450)

      clienteSantiago.simularPropinaPorEstado(750).shouldBe(750)
    }
  }

  describe("Clientes de Barrio") {
    describe("Un/a cliente resfriado de las rosas") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.RESFRIADO)
      clienteSantiago.cambiarPlataDelBolsillo(1000)
      clienteSantiago.cambiarDeBarrio(LasRosas())

      clienteSantiago.propinaMasBarrio(1000).shouldBe(1050)

    }

    describe("Un/a cliente resfriado en las lauchas") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.RESFRIADO)
      clienteSantiago.cambiarPlataDelBolsillo(1000)
      clienteSantiago.cambiarDeBarrio(LasLauchas())

      clienteSantiago.propinaMasBarrio(1000).shouldBe(500)

    }

    describe("Un/a cliente resfriado en las torres") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.RESFRIADO)
      clienteSantiago.cambiarPlataDelBolsillo(1000)
      clienteSantiago.cambiarDeBarrio(LasTorres())

      clienteSantiago.propinaMasBarrio(1000).shouldBe(1000)

    }

    describe("Un/a cliente resfriado en barrio verde") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.RESFRIADO)
      clienteSantiago.cambiarPlataDelBolsillo(1000)
      clienteSantiago.cambiarDeBarrio(BarrioVerde())

      clienteSantiago.propinaMasBarrio(1000).shouldBe(1200)

    }

    describe("Un/a cliente feliz en las rosas") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.FELIZ)
      clienteSantiago.cambiarPlataDelBolsillo(1000)
      clienteSantiago.cambiarDeBarrio(LasRosas())

      clienteSantiago.propinaMasBarrio(1000).shouldBe(300)
    }

    describe("Un/a cliente feliz en las lauchas") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.FELIZ)
      clienteSantiago.cambiarPlataDelBolsillo(1000)
      clienteSantiago.cambiarDeBarrio(LasLauchas())

      clienteSantiago.propinaMasBarrio(1000).shouldBe(125)
    }

    describe("Un/a cliente feliz en las torres") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.FELIZ)
      clienteSantiago.cambiarPlataDelBolsillo(1000)
      clienteSantiago.cambiarDeBarrio(LasTorres())

      clienteSantiago.propinaMasBarrio(1000).shouldBe(250)
    }

    describe("Un/a cliente feliz en barrio verde") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.FELIZ)
      clienteSantiago.cambiarPlataDelBolsillo(1000)
      clienteSantiago.cambiarDeBarrio(BarrioVerde())

      clienteSantiago.propinaMasBarrio(1000).shouldBe(450)
    }

    describe("Un/a cliente indiferente en las torres") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.INDIFERENTE)
      clienteSantiago.cambiarPlataDelBolsillo(950)
      clienteSantiago.cambiarDeBarrio(LasTorres())

      clienteSantiago.propinaMasBarrio(75000).shouldBe(950)

      clienteSantiago.cambiarDeBarrio(LasRosas())

      clienteSantiago.propinaMasBarrio(75000).shouldBe(1000)

    }

    describe("Un/a cliente indiferente en las rosas") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.INDIFERENTE)
      clienteSantiago.cambiarPlataDelBolsillo(950)
      clienteSantiago.cambiarDeBarrio(LasRosas())

      clienteSantiago.propinaMasBarrio(75000).shouldBe(1000)


    }

    describe("Un/a cliente indiferente en las lauchas") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.INDIFERENTE)
      clienteSantiago.cambiarPlataDelBolsillo(950)
      clienteSantiago.cambiarDeBarrio(LasLauchas())

      clienteSantiago.propinaMasBarrio(75000).shouldBe(475)


    }

    describe("Un/a cliente indiferente en barrio verde") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.INDIFERENTE)
      clienteSantiago.cambiarPlataDelBolsillo(950)
      clienteSantiago.cambiarDeBarrio(BarrioVerde())

      clienteSantiago.propinaMasBarrio(75000).shouldBe(1150)


    }

    describe("Un/a cliente enojado en barrio verde") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.ENOJADO)
      clienteSantiago.cambiarPlataDelBolsillo(400)
      clienteSantiago.cambiarDeBarrio(BarrioVerde())

      clienteSantiago.propinaMasBarrio(5460).shouldBe(200)
    }

    describe("Un/a cliente enojado en las rosas") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.ENOJADO)
      clienteSantiago.cambiarPlataDelBolsillo(400)
      clienteSantiago.cambiarDeBarrio(LasRosas())

      clienteSantiago.propinaMasBarrio(5460).shouldBe(50)
    }

    describe("Un/a cliente enojado en las lauchas") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.ENOJADO)
      clienteSantiago.cambiarPlataDelBolsillo(400)
      clienteSantiago.cambiarDeBarrio(LasLauchas())

      clienteSantiago.propinaMasBarrio(5460).shouldBe(0)
    }

    describe("Un/a cliente enojado en las torres") {
      clienteSantiago.cambiarEstadoDeAnimo(Animos.ENOJADO)
      clienteSantiago.cambiarPlataDelBolsillo(400)
      clienteSantiago.cambiarDeBarrio(LasTorres())

      clienteSantiago.propinaMasBarrio(5460).shouldBe(0)
    }


  }


})
