object B2 {
    def maxSubSeq[T](l:List[T], p:T => Boolean):List[T] = {
        def aux[T](attuale:List[T],residua:List[T],p:T =>Boolean):List[T]= (attuale,residua) match{
            case (_,Nil)=>attuale
            case (_,_) => {
                if(attuale.size == 0 ) aux(residua.span(x=>x!=p)._1,residua.span(x=>x!=p)._2,p)
                if(attuale.size < residua.span(x=>x!=p)._1.size) aux(residua.span(x=>x!=p)._1,residua.span(x=>x!=p)._2,p)
                else aux(attuale,residua.span(x=>x!=p)._2,p)
            }
        }
        aux(l.span(x=>x!=p)._1,l.span(x=>x!=p)._2,p)
    }
}
