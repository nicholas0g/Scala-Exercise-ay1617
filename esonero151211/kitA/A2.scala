object A2 extends App{
    def makeStr(c:Int=>Char)(n:Int):String = {
        0 until n map{c(_).toString}reduce(_+_)
    }
}