object q1 extends App{
val p1=Point(2,3)
val p2=Point(3,5)
val p3=p1+p2
println(p3 + " created by adding " + p1 + " and " + p2)

}
case class Point(x:Int,y:Int){
 def +(that:Point)=Point(this.x+that.x,this.y+that.y)
}