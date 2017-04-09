object D2{
    def combineLists(a:List[String],b:List[String]): List[String] = (a,b) match {
        case (Nil,Nil)=>Nil
        case(Nil,sdas)=> sdas
        case(sben,Nil)=> sben
        case (h1::t1,h2::t2) => h1+h2 :: combineLists(t1,t2)
    }
}