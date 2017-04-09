// Si vuole scrivere una classe Scala per la gestione dei numeri complessi. Si ricordi che:
//• un numero complesso è una coppia a+ib dove a è la parte reale e b è la parte
//immaginaria;
//• la somma di due numeri complessi è (a+ib)+(c+id) = (a+c)+i(b+d);
//• il prodotto di due numeri complessi è (a+ib)(c+id) = (ac-bd)+i(bc+ad).
import scala.language.implicitConversions
object Complex{
    implicit def tomyC(r:Double):Complex = Complex(r,0)
}
case class Complex(r:Double, i:Double){
    def +(n:Complex) = Complex(r+n.r,i+n.i)
    def *(n:Complex) = Complex(r*n.r - i*n.i,i*n.r + r*n.i)
}

