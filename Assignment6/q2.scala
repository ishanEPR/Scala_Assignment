object q2 extends App{
val p1=Point(2,4)
val p2=p1.move(3,4)
print(p1 + " moved by (3,4) became= "+p2)

}
case class Point(x:Int,y:Int){
	
def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

}