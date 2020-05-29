object q5 {
  def main(args:Array[String]){
    println("sum of even numbers:" +sumOfEvenNumbers(10));
  }
  
  def sumOfEvenNumbers(a:Int):Int={
    if(a==1){
      return 0;
    }
    else if(a%2==1){
      return sumOfEvenNumbers(a-1);
    }
    else{
      return a + sumOfEvenNumbers(a-1)
    }
  }
}