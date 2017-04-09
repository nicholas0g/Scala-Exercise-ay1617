def intersection[T](l1:List[T], l2:List[T]):List[T] = l1 match{
    case Nil => Nil
    case h::t if(find(h,l2)) => h::intersection(t.filter(_!=h),l2.filter(_!=h))
    case h::t =>intersection(t.filter(_!=h),l2)
}