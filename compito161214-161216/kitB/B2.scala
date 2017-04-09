// scrivere soluzione qui...
object B2{
    def mioFor(c: =>Boolean,s: =>Unit)(funzione: =>Unit):Unit = if(!c) () else {funzione;s;mioFor(c,s)(funzione)}
}