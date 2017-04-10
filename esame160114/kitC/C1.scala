import scala.language.implicitConversions
//devo definire una serie di classi e operaazioni
object Point{ //companion onject
    implicit def tolistapunti(l:List[Point])=listaPunti(l) //converti una lista in un mio ogetto
}
case class listaPunti(l:List[Point]){ //dichiarazione ogetto
    def +++(l2:List[Point]) = l:::l2 //operazioni eseguibili sull'ogetto'
}
case class Circle(x:Double,y:Double,r:Double){ //dichiarazione ogetto
    def >?(l:List[Point])= l.forall(i=>(Math.pow(i.x-x,2)+Math.pow(i.y-y,2) < Math.pow(r,2)))
    def >>(l:List[Point])= l.filter(i=>(Math.pow(i.x-x,2)+Math.pow(i.y-y,2) < Math.pow(r,2)))
}
case class Point(x:Double,y:Double){ //dichiarazione ogetto
    override def toString:String = "("+x+","+y+")" //override del metodo print
}
