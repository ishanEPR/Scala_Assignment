object q2{
def attendees(price:Int):Int=120+(15-price)/5*20
def revenue(price:Int):Int=attendees(price)*price
def cost(price:Int):Int=500+attendees(price)
def profit(price:Int):Int=revenue(price)-cost(price)

def main(args:Array[String]){

println("when ticket Rs.5 Total profit ="+profit(5))
println("when ticket Rs.10 Total profit ="+profit(10))
println("when ticket Rs.15 Total profit ="+profit(15))
println("when ticket Rs.20 Total profit ="+profit(20))
println("when ticket Rs.25 Total profit ="+profit(25))
println("when ticket Rs.30 Total profit ="+profit(30))
println("when ticket Rs.40 Total profit ="+profit(40))
 
}

}