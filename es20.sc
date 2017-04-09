def inferiori(l:List[Int]):List[(Int,Int)] = {
    l.sorted.distinct.map((x:Int)=>(x,l.filter(_< x).size))
}