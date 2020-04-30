import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.Test

class SampleTest {
    @Test
    fun test() {
        "foo bar" shouldContain "foo"
        42.toString() shouldBe "42"
    }
}
