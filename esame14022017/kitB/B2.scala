//devo estendere la classe List con un nuovo metodo
import scala.language.implicitConversions
object MyList{ //dichiarazione companion onject
    implicit def tomia[T](l:List[T])=MyList(l) //conversione da List al mio nuovo tipo per cui creerò l'estenzione
}
case class MyList[T](l:List[T]){ //definisco il mio nuovo tipo
    def project(lista:List[Boolean]):List[T]={ //dichiarazione del mio metodo
        //il metodo confronta due liste e ritorna una lista solo quando si verifica una particolare condizione in una delle due liste
        def aux(l1:List[T],l2:List[Boolean]):List[T] = (l1,l2) match{
            case (_,Nil)=>Nil
            case(Nil,_)=>Nil
            case(h::t,h1::t1) => if(h1) h::aux(t,t1) else aux(t,t1)
        }
        if(l.size< lista.size) aux(l,lista) else aux(l.take(lista.size),lista)
    }
}