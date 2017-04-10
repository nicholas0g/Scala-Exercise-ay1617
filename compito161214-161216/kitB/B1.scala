//semplifico la classe EXp
sealed abstract class Exp{
    def simplify:Exp= this match{ //metodo richiesto dall'esercizio'
        case And(a,b) => (a.simplify,b.simplify) match { //per semplificare un caso devo prima semplificare eventuali sottocasi
            case (True(),xx) => xx
            case (xx,True()) => xx
            case (False(),_) => False()
            case(_,False()) => False()
            case (xx,yy)=>And(xx,yy)
    }
    case Or(a,b) => (a.simplify,b.simplify) match { //per semplificare un caso devo prima semplificare eventuali sottocasi
            case (_,True()) => True()
            case(True(),_)=> True()
            case (xx,False()) => xx
            case(False(),xx)=> xx
            case (xx,yy) => Or(xx,yy)
    }
    case Not(a) => (a.simplify) match { //per semplificare un caso devo prima semplificare eventuali sottocasi
            case True() => False()
            case False() => True()
            case x =>Not(x)
    }
    case e=> e //caso generico in cui non ho costrutti definiti da Exp
    }
}

case class And(a:Exp, b:Exp) extends Exp
case class Or(a:Exp, b:Exp) extends Exp
case class Not(a:Exp) extends Exp
case class X() extends Exp
case class Y() extends Exp
case class True() extends Exp
case class False() extends Exp
