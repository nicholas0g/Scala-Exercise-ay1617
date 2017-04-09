object X1{
    def numEqual(f1:Int=>Int,f2:Int=>Int)(a:Int,b:Int):Int = {
        def aux(n:Int,contatore:Int):Int = {
            val uguali=f1(n)==f2(n)
            if (n > b) contatore else aux(n+1,if(uguali) contatore+1 else contatore) 
        }
        aux(a,0)
    }
}