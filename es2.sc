def sommaq(x:Int, y:Int):Int=if(x>y) 0 else x*x +sommaq(x+1,y)
println(sommaq(1,100))