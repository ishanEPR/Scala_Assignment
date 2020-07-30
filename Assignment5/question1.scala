class Rational(n:Int,d:Int)
{
    require(d>0,"d must be greater than zero")
    def numer=n/gcd(n,d)
    def denum=d/gcd(n,d)
    def this(n:Int)=this(n,1)
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
    def negative=new Rational(-this.numer,this.denum)
    override def toString=numer+"/"+denum
}

object question1{
		def main(args:Array[String])
		{
		val r1=new Rational(7,12)
		val r2=r1.negative

		println("Rational number="+r1)
		println("Negation of Rational number="+r2)

		}
}
