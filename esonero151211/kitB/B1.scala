//definisco la classe punto sul piano con le operazioni di somma e distanza
import scala.language.implicitConversions
object Punto{
    implicit def sPunto(x:Int) = Punto(x,x)
}
case class Punto(x:Double, y:Double){
        def +(b:Punto) = Punto(x+b.x,y+b.y)
        def <->(b:Punto):Double = Math.sqrt(Math.pow(x-b.x,2)+Math.pow(y-b.y,2))
    }