object D1{
    def alterna(x:Int)(a: =>Unit)(b: =>Unit): Unit = if(x==0) () else {a;b;alterna(x-1)(a)(b)}
}