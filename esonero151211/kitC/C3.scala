sealed abstract class Tree(){
    def equals(t:Tree):Boolean = (this,t) match{
        case (E(),E()) => true
        case (_,E()) => false
        case (E(),_) => false
        case (T(l2,x2,r2),T(l1,x1,r1)) => (l1==l2) && (x1 == x2) && (r1 == r2)
    }
}
case class E() extends Tree()
case class T(l:Tree, x:Int, r:Tree) extends Tree()
