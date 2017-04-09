//scorro un albero cercando l'elemento minore e restituendo il numero di iterazioni che mi ci hanno portato

sealed abstract class Tree(){
    def min=aux(0)
    def aux(m:Int):(Int,Int)= this match{
        case E()=>(0,m)
        case T(l,n,_) => {
            val (num,min) = l.aux(n)
            (num+1,min)
        }
    }
}
case class E() extends Tree()
case class T(l:Tree, x:Int, r:Tree) extends Tree()
