//The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?


object q2{
 def main(args:Array[String]){
volume(5);

}

def volume(radius:Double){
//var pi:Float=3.14f;
var volume_sphere:Double=4/3*math.Pi* radius*radius*radius;
println("volume of sphere= "+volume_sphere);
}
}