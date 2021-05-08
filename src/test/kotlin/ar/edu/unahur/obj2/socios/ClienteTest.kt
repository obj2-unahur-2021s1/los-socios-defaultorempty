package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({

  describe("Un/a cliente") {


    var matias  = Cliente(Resfriado(),1000,LasLauchas(), Propina(Resfriado(),LasLauchas()))

    matias.simularPropina(1000).shouldBe(500)


  }
})
