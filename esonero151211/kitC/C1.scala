//definisco un metodo ifElse, importante il =>Unit che fa calcolare e comparire il tipo dopo la conversione
object C1{
    def ifElse(verifica:Boolean)(a: =>Unit)(b: =>Unit):Unit = if(verifica) a else b 
}