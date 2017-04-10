object B3{
    //implementazione funzione di ordine superiore
    def max1(f1:Int=>String,f2:Int=>String):Int=>String = {
        x => { //particolare attenzione alla sintassi x=>{} che va utilizzate per le funzioni di ordine superiore per prendere i parametri passati
            val a=f1(x)
            val b=f2(x)
            if(a.length>b.length) a else b
        }
    }
}
