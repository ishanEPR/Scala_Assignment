object question1 extends App{
val r1=new Rational(2,4)
val r2=new Rational(6,8)

println("Negative Rational number"+r1.negative)
println("Negative Rational number"+r2.negative)

}
class Rational(n:Int,d:Int)
{
def numer=n
def denum=d
def negative=new Rational(-this.numer,this.denum)
override def toString=numer+"/"+denum
}
