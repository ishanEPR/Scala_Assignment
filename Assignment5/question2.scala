class Rational(n:Int,d:Int)
{
        def numer=n/gcd(n,d)
        def denum=d/gcd(n,d)
        def this(n:Int)=this(n,1)
        private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
        def -(r:Rational)=new Rational(this.numer*r.denum-this.denum*r.numer,this.denum*r.denum)
	override def toString=numer+"/"+denum
}

object question2{
		def main(args:Array[String])
		{
		val x=new Rational(3,4)
		val y=new Rational(5,8)
		val z=new Rational(2,7)
		val result=x-y-z
		println("Subtraction of given three Rational Numbers= "+result)

		}
}
