object q4{
  def main(args:Array[String]){
    var x = search(5);
    if(x==true){
      println("Even");
    }
    else{
      println("Odd");
    }
  }
  
  def search(n:Int):Boolean={
    if(n==0){
      return true;
    }
    else if(n==1){
      return false;
    }
    else{
      return search(n-2);
    }
  }
}