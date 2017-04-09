// completare questo file con la soluzione...

sealed abstract class Exp{
    def simplify:Exp= this match{
        case And(a,b) => (a.simplify,b.simplify) match {
            case (True(),xx) => xx
            case (xx,True()) => xx
            case (False(),_) => False()
            case(_,False()) => False()
            case (xx,yy)=>And(xx,yy)
    }
    case Or(a,b) => (a.simplify,b.simplify) match {
            case (_,True()) => True()
            case(True(),_)=> True()
            case (xx,False()) => xx
            case(False(),xx)=> xx
            case (xx,yy) => Or(xx,yy)
    }
    case Not(a) => (a.simplify) match {
            case True() => False()
            case False() => True()
            case x =>Not(x)
    }
    case e=> e
    }
}

case class And(a:Exp, b:Exp) extends Exp
case class Or(a:Exp, b:Exp) extends Exp
case class Not(a:Exp) extends Exp
case class X() extends Exp
case class Y() extends Exp
case class True() extends Exp
case class False() extends Exp
