def somma(f:Int=>Int):(Int,Int)=>Int={
    def res(a:Int, b:Int):Int = if(a>b) 0 else f(a)+res(a+1,b)
    res
}
val sommaQuadrati = somma(x=>x*x)
println(sommaQuadrati(1,3)) // stampa 14 (somma dei quadrati di 1, 2 e 3)