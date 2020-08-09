import math.hypot
object q3 extends App{

val p1=Point(2,3)
val p2=Point(3,4)
println("Distance between " + p1 + " and " + p2 + " is " + p1.distance(p2))

}
case class Point(x:Int,y:Int){

def distance(that: Point) = math.hypot(this.x - that.x, this.y - that.y)

} 