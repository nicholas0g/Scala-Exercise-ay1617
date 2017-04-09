import scala.language.implicitConversions
object MyList{
    implicit def tomia[T](l:List[T])=MyList(l)
}
case class MyList[T](l:List[T]){
    def project(lista:List[Boolean]):List[T]={
        def aux(l1:List[T],l2:List[Boolean]):List[T] = (l1,l2) match{
            case (_,Nil)=>Nil
            case(Nil,_)=>Nil
            case(h::t,h1::t1) => if(h1) h::aux(t,t1) else aux(t,t1)
        }
        if(l.size< lista.size) aux(l,lista) else aux(l.take(lista.size),lista)
    }
}