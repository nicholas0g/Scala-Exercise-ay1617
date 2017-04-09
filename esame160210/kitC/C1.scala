// completare questo file con la soluzione...

sealed abstract class Tree(){
    def minMax:(Int,Int,Int) = {
        val(m1,n1)=this.min(0,0)
        val(m2,n2)=this.max(0,0)
        (m1,m2,n1+n2)
    }
    def min(ric:Int, n:Int):(Int,Int)= this match{
        case E()=>(0,Integer.MAX_VALUE)
        case T(l,x,_)=>{
            val(r,nn)=l.min(ric,x)
            if(x < nn) (r+1,x)
            else(r+1,nn)
        }
    }
    def max(ric:Int, n:Int):(Int,Int)= this match{
        case E()=>(0,Integer.MIN_VALUE)
        case T(_,x,r)=>{
            val(r1,nn)=r.max(ric,x)
            if(x > nn) (r1+1,x)
            else(r1+1,nn)
        }
    }
    
}
case class E() extends Tree()
case class T(l:Tree, x:Int, r:Tree) extends Tree()
