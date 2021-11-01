import org.scalatest.funsuite.AnyFunSuite

class TestSet extends AnyFunSuite {
  val setTest = new VacantSet[Element]

  val setA= new VacantSet[Element]
  val setB = new NonVacantSet[Element](Element(3),setA.incl(Element(7)),setA.incl(Element(10)))


  test("Test incl") {
    val setTest1 = setTest.incl(Element(15)).incl(Element(30))
    assert(setTest1.contains(Element(15)))
  }

  test("Test incl method 2"){
    val setTest2 = setB.incl(Element(12)).incl(Element(20))
    assert(setTest2.contains(Element(12)))
  }

  test("test contain method"){
    assert(setB.contains(Element(10)))
    assert(!setB.contains(Element(2)))

  }

}
