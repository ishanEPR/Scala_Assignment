object q2 {
  def main(args:Array[String]){
    loop(50)
  }
  
  def loop(n:Int):Unit={
    if(n>0){
      loop(n-1);
    }
    if(isPrime(n)!=0){
      println(isPrime(n));
    }
  }
  
  def isPrime(n:Int, i:Int=2):Int=n match{
     case x if(x<2) => 0;
     case x if(x==2) => x;
     case x if(x%i==0) => 0;
     case x if(i*i>x) => x;
     case x => isPrime(x, i+1);
   }
}