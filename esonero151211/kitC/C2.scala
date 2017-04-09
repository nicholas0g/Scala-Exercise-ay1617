object C2 {
    def makeList[T](x:Int=>T)(n:Int):List[T] =  List.range(0,n).map(x(_))
}