object q4 extends App{
val p1=Point(2,3)
println("Inverse of " + p1 + " is " + p1.invert)

}
case class Point(x:Int,y:Int){
def invert = Point(this.y,this.x)
} 