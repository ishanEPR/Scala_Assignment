object q1 {

  def main(args:Array[String]){
    var a = 5;
    if(isPrime(a)==true){
      println("5 is a prime number.");
    }
    if(isPrime(a)==false){
      println("5 is not a prime number.");
    }
    
    var b = 8;
    if(isPrime(b)==true){
      println("8 is a prime number");
    }
    if(isPrime(b)==false){
      println("8 is not a prime number.");
    }
  } 
    
   def isPrime(n:Int, i:Int=2):Boolean=n match{
     case x if(x<2) => false;
     case x if(n==2) => true;
     case x if(n%i==0) => false;
     case x if(i*i>n) => true;
     case x => isPrime(n, i+1);
   }

}