class VacantSet[A <: Ordered[A]] extends Set[A] {

  def contains(x: A): Boolean = false

  def incl(x: A): Set[A] = new NonVacantSet(x, new VacantSet[A], new VacantSet[A])

}