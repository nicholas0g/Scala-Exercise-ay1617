sealed abstract class Tree(){
    def find(n:Int):(Int,Boolean) = {
        def aux()
    }
    this match{
        case E() =>
    }
}
case class E() extends Tree()
case class T(l:Tree, x:Int, r:Tree) extends Tree()
