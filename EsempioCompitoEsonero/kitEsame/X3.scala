sealed abstract class Expr(){
    def &&(a:Expr):Expr = And(this,a)
    def ||(a:Expr):Expr = Or(this,a)
    def unary_! = Not(this)
    def apply(x:Boolean,y:Boolean):Boolean=this match{
        case And(a,b) => a(x,y) && b(x,y)
        case Or(a,b) => a(x,y) || b(x,y)
        case Not(a) => !a(x,y) 
        case X() => x
        case Y() => y
    }
}

case class X() extends Expr()
case class Y() extends Expr()
case class And(e1:Expr, e2:Expr) extends Expr()
case class Or(e1:Expr, e2:Expr) extends Expr()
case class Not(e:Expr) extends Expr()
