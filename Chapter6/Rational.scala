// Scala creates a PRIMARY CONSTRUCTOR when given CLASS PARAMETERS.
class Rational(n: Int, d: Int) {
  // any code not part of a field or method is included in the PRIMARY CONSTRUCTOR.
  require(d != 0)
  println("Created " + n + "/" + d)
  override def toString = n + "/" + d

  // we must make FIELDS for numerator and denominator if we wish to access them on other Rational objects
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  // AUXILIARY CONSTRUCTORS
  // In Scala, only the primary constructor can invoke a superclass constructor.
  def this(n: Int) = this(n, 1)

  // FIELDS allow us to say, for instance, that.numer
  def add(that: Rational): Rational = new Rational(
    numer * that.denom + that.numer * denom, 
    denom * that.denom
  )

  // SELF-REFERENCES with the "this" keyword
  def lessThan(that: Rational) = this.numer * that.denom < that.numer * this.denom
  def max(that: Rational) = if (this.lessThan(that)) that else this

  // PRIVATE METHOD
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  // DEFINING OPERATORS
  def + (that: Rational): Rational = 
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def * (that: Rational): Rational = new Rational(numer * that.numer, denom * that.denom)

  // constants don't need to follow Java's MY_CONSTANT naming convention
  val MyConstant = 5


}
