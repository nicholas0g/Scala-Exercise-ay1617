import scala.language.implicitConversions
object X2{
    implicit def toStringa(s:String)=MyString(s)
}
case class MyString(s:String){
    def |||(s1:String):String={
        0 until (s.length max s1.length) map{i => (if(i< s.length)s.charAt(i).toString else "" )+(if(i< s1.length)s1.charAt(i).toString else "")}reduce(_+_)
    }
}