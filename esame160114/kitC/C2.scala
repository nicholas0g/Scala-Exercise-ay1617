object C2{
    def ps(a:List[Int],b:List[Int]):Int = (a,b) match{
        case (Nil,_)=> 0
        case (_,Nil)=> 0
        case(h::t,h1::t1) => h*h1 + ps(t,t1)
    }
}