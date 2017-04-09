case class Rational(n:Int,d:Int){
    def *(c:Rational) = new Rational(this.n*c.n,this.d*c.d)
    def >(c:Rational):Boolean = (this.n/this.d)>(c.n/c.d)
    def ==(c:Rational):Boolean =(this.n==c.n) && (c.d==this.d)
}
val r1 = new Rational(2, 7)
val r2 = new Rational(8, 6)
val r3 = new Rational(4,14)
println(r1==r2)  // stampa 8/21

