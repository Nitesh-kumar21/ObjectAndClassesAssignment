import com.knoldus.{Succ, Zero}
import org.scalatest.flatspec.AnyFlatSpec


class IntegerTest extends AnyFlatSpec {
  val zero = Zero
  val one = new Succ(zero)
  val two = new Succ(one)
  val three = new Succ(two)
  "Predecessor" should "give predecessor of one is zero " in {
    assert(one.predecessor.isZero)
  }
  "Successor  with  - " should "give Successor  of 2-1 " in {
    assert(two.-(one).successor.isZero == false)
  }
  "Successor" should "give successor of zero" in {
    assert(zero.successor.isZero == false)
  }
  "Predecessor with  - " should "give predecessor of 1-0" in {
    assert(one.-(zero).predecessor.isZero)
  }
  "Successor  with  + " should "give Successor  of 1+0 " in {
    assert(one.+(zero).successor.isZero == false)
  }
  "Predecessor and + " should "give predecessor of 3-2 " in {
    assert(three.-(two).predecessor.isZero)
  }
  "Predecessor of one" should "give zero " in {
    assert(one.predecessor == zero)
  }

}