class NonVacantSet[A <: Ordered[A]](elem:A, left: Set[A], right: Set[A]) extends Set[A] {

  def contains(x: A): Boolean =

    if (x < elem) {
      left contains x
    }

    else if (x > elem) {
      right contains x
    }

    else {
      true
    }

  def incl(x: A): Set[A] =
    if (x < elem) {
      new NonVacantSet(elem, left incl x, right)
    }

    else if (x > elem) {
      new NonVacantSet(elem, left, right incl x)
    }

    else {
      this
    }
}