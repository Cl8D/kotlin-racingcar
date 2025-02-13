package calculator.operator

import calculator.operand.Operand
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class MultiplyOperatorTest : DescribeSpec({

    describe("operate") {
        context("두 값이 주어지면") {
            it("곱한 값을 반환한다.") {
                MultiplyOperator.operate(Operand.of("10.0"), Operand.of("2.0")) shouldBe Operand.of(20.0)
            }
        }
    }
})
