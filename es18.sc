def mediaveicoli(l:List[Int]):Double = {
    l.span(_> -1)._1.reduce(_+_).toDouble/l.span(_> -1)._1.size.toDouble
}
var mial=List(1,2,3,4,6,67,3,2,4,5,4,3,4,-1,2,4,2,2,3,4,8)
println(mediaveicoli(mial))