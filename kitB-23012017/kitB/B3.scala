object B3 {
    def test[T](l1:List[T], l2:List[T]):Boolean = (l1,l2) match {
        case(_,Nil) =>true
        case(Nil,_) =>true
        case(h1::t1,h2::t2) => if(find(h1,h2::t2)) test(t1,h2::t2) else if(l1.distinct.size!=l2.distinct.size) false else false
    }
    def find[T](x:T,l:List[T]):Boolean = l match{
        case Nil =>false
        case h::t=> if(h == x) true else find(x,t)
    }
    
}
