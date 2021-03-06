package co.helmethair.scalatest.example

class SomeCodeTest extends AnyFunSpec with Matchers {
  describe("someFunc in SomeCode") {
    it("returns '0' for 0 input") {
      SomeCode.someFunc(0) shouldBe "0"
    }

    it("calculates square") {
      SomeCode.someFunc(3) shouldBe "9"
    }

  }
}
