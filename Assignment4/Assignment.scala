object Assignment{
  def main(args:Array[String]) {

    translate()
  }
  def translate(): Unit ={
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var s:String = "Ishan"
    val E=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
    val D=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key+a.size)%a.size)

    val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))
    val ct=cipher(E,s,1,alphabet)
    val pt=cipher(D,ct,1,alphabet)
    
    println("Entered your String= "+s)
    println("Encrypted String is= "+ct)
    println("Decrypted String is= "+pt)
  }
}