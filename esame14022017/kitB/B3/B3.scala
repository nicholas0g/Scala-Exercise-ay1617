object B3{
    def max1(f1:Int=>String,f2:Int=>String):Int=>String = {
        x => {
            val a=f1(x)
            val b=f2(x)
            if(a.length>b.length) a else b
        }
    }
}
