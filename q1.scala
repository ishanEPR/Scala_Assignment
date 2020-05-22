//1. The temperature is 35C; convert this temperature into Fahrenheit.
//ºF =ºC * 1.8000 + 32.00

object q1{
def main(args:Array[String]){
temperture_farenheit(35);
}
def temperture_farenheit(a:Float){
var faren_val:Float=a* 1.8000f + 32.00f;
println("Farenheit value= "+faren_val);
}

}