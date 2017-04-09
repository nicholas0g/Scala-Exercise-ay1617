import scala.language.implicitConversions
object MyRichSet{
    implicit def tomyRichSet(set:Set[Int])=MyRichSet(set)
}
case class MyRichSet(set:Set[Int]){
    def +(s:Set[Int])=set.union(s)
    def -(s:Set[Int])=set.diff(s)
}