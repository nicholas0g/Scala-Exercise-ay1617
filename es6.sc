def applicaDuevolte(f:Int=>Int, x:Int):Int = f(f(x))
val y = applicaDuevolte(x=>x+1, 10)
println(y) // stampa 12