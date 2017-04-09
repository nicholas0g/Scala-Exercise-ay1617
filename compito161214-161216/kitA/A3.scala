sealed abstract class Exp{
   def apply(x:Boolean, y: Boolean):Boolean = this match{
        case And(a,b) => a(x,y) && b(x,y)
        case Or(a,b) => a(x,y) || b(x,y)
        case Not(a) => !a(x,y)
        case X() => x
        case Y() => y
        case True() => true
        case False() => false
    }
    override def toString:String = this match{
        case And(a,b) => a.toString + "and " + b.toString
        case Or(a,b) => a.toString + " or " +b.toString
        case Not(a) => "not "+a.toString
        case X() => "x"
        case Y() => "y"
        case True() => "True"
        case False() => "False"
    }

    def <=>(e:Exp)={
        this(true,true)==e(true,true)&&this(true,false)==e(true,false)&&this(false,false)==e(false,false)&&this(false,true)==e(false,true)
    }
}
case class And(a:Exp, b:Exp) extends Exp
case class Or(a:Exp, b:Exp) extends Exp
case class Not(a:Exp) extends Exp
case class X() extends Exp
case class Y() extends Exp
case class True() extends Exp
case class False() extends Exp