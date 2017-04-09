def allDistinct[T](l:List[T]):Boolean = {
    if (l.size==0) true else if (l.tail.forall(_ != l.head)) allDistinct(l.tail) else false
}