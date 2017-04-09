import scala.language.implicitConversions
object Point{
    implicit def tolistapunti(l:List[Point])=listaPunti(l)
}
case class listaPunti(l:List[Point]){
    def +++(l2:List[Point]) = l:::l2
}
case class Circle(x:Double,y:Double,r:Double){
    def >?(l:List[Point])= l.forall(i=>(Math.pow(i.x-x,2)+Math.pow(i.y-y,2) < Math.pow(r,2)))
    def >>(l:List[Point])= l.filter(i=>(Math.pow(i.x-x,2)+Math.pow(i.y-y,2) < Math.pow(r,2)))
}
case class Point(x:Double,y:Double){
    override def toString:String = "("+x+","+y+")"
}
