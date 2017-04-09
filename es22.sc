def removeDuplicates[T](l:List[T]):List[T] = {
    l match {
        case Nil => Nil
        case h::t => h::removeDuplicates(t.filter(_!=h))
    }

}