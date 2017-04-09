// scrivere soluzione qui...
object B3{
    def query1(l:List[Studente]):List[(String,List[String])] = {
        val la = l.filter(_.età>=22).map(x=>x.esami.map(y=>(y,x.nome))).flatten.groupBy(_._1).map(t=>(t._1, t._2.map(_._2))).toList
        la
    }

    def query2(l:List[Studente]):List[(String,String)] = {
        val esami=l.map(_.esami).flatten.distinct
        for{
            i<-esami
            j<-esami
            if(i < j)
            if(l.count(s=>s.esami.contains(i) && s.esami.contains(j))>=2)
        } yield(i,j)
    }
}