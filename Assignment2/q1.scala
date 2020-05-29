object q1{
def wate(hours:Int):Int=hours*150
def ot(hours:Int):Int=hours*75
def income(h1:Int,h2:Int):Int=wate(h1)+ot(h2)
def tax(income:Int):Double=income*.1
def takehome(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2))

def main(args:Array[String]){

println("Total Income ="+takehome(40,20))
 
}

}