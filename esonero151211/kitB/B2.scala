//riscrivo il funzionamento della classe string in modo tale che restituisca una stringa fatta in un determinato modo
import scala.language.implicitConversions
object B2 extends App{
    implicit def tomyString(s:String) = myString(s)
}
case class myString(s:String){
    def -->(n:Int) = s.map(_.toString*n).reduce(_+_)
}