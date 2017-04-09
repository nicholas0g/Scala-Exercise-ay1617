object D3{
    def makeTree(n:Int)={
            def aux(n:Int,i:Int):Tree = if(n < 1) E()  else T(aux(n-1,2*i),i,aux(n-1,2*i+1))
            aux(n,1)
    }
}
sealed abstract class Tree()
case class E() extends Tree() {
    override def toString = "-"
}
case class T(l:Tree, x:Int, r:Tree) extends Tree() {
    override def toString = "["+l+","+x+","+r+"]"
}
