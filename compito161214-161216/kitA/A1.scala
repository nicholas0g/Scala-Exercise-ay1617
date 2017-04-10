//Estendo la classe Set[Int] con dei metodi + e -
import scala.language.implicitConversions
object MyRichSet{ //dichiaro companion object
    implicit def tomyRichSet(set:Set[Int])=MyRichSet(set) //definizione conversione a mio nuovo oggetto
}
case class MyRichSet(set:Set[Int]){ //classe che contiene il mio nuovo oggetto
    def +(s:Set[Int])=set.union(s) //estenzioni necessarie (+,-)
    def -(s:Set[Int])=set.diff(s)
}