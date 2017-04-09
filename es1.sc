def mcd(x:Int, y:Int):Int = if(y==0) x else mcd(y,x%y)
println(mcd(1444,3212312))