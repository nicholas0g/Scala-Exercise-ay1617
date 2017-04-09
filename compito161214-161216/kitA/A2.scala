object A2{
    def query1(l:List[Studente]) = {
        val media=l.map(_.età).reduce(_+_).toDouble/l.size
        l.filter(x=>x.età< media && x.esami.size>=3)
    }
    def query2(l:List[Studente])={
        l.map(_.esami).flatten.groupBy(identity).filter(x=>x._2.size > 2).map(_._1).toList
    }
}