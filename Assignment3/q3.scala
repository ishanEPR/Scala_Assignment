object q3{
def sum(n:Int):Int={
  if(n==1) 1
  else n+sum(n-1)

  }
def main(args:Array[String])
{
println("sum= "+sum(5))
}

}