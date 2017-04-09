def union[T](l1:List[T], l2:List[T]):List[T] = {
    removeDuplicates(l1:::l2)
}