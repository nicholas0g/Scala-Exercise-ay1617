object A2{
    def query1(l:List[Studente]) = {
        //effettuo ricerca per tutti gli studenti che hanno età media e che hanno superato almeno 3 esami
        val media=l.map(_.età).reduce(_+_).toDouble/l.size
        l.filter(x=>x.età< media && x.esami.size>=3)
    }
    def query2(l:List[Studente])={
        //filtro la lista degli esami superata da almeno due studenti
        l.map(_.esami).flatten.groupBy(identity).filter(x=>x._2.size > 2).map(_._1).toList
    }
}