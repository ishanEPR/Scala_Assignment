object question2 extends App{
val x=new Rational(3,4)
val y=new Rational(5,8)
val z=new Rational(2,7)
val result=x-y-z
println("Subtraction of given three Rational Numbers= "+result)
}
class Rational(n:Int,d:Int)
{
def numer=n
def denum=d
def -(r:Rational)=new Rational(this.numer*r.denum-this.denum*r.numer,this.denum*r.denum)
override def toString=numer+"/"+denum

}