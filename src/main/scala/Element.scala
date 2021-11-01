case class Element(value: Int) extends Ordered[Element] {

  def compare(that: Element): Int =

    if (this.value < that.value) {
      -1
    }
    else if (this.value > that.value) {
      1
    }
    else 0
}