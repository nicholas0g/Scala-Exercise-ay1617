def componi(f1:Int=>Int, f2:Int=>Int):Int=>Int= {
    def f(x:Int)=f1(f2(x))
    f
}
val f = componi(x=>x*x, x=>x+1)
println(f(9)) // stampa 100