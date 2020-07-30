class account(id:String,aNumber:Int,balance:Double)
{
	var nic=id;
	var accNumber=aNumber;
	var aBalance=balance;
}

object question4
{
	def main(args:Array[String])
	{
		println("-------------------------------------");
		println("  Overdraft-Total Balance-Interest");
		println("-------------------------------------\n");

		var acc1=new account("971V",371,0);
		var acc2=new account("972V",372,1000);
		var acc3=new account("973V",373,50000);
		var acc4=new account("974V",374,-1000);
		var acc5=new account("978V",375,-10000);
		var acc6=new account("979V",376,2500);
		val bank:List[account]=List(acc1,acc2,acc3,acc4,acc5,acc6);
		
		//Overdraft account numbers
		print("Overdraft account numbers   : ");
		var ODlist=overdraft(bank);
		ODlist.foreach(x=>print(x.accNumber+"   "));

		//Total account balance
		var tBalance=balance(bank);
		print("\nTotal account balance       : "+tBalance.aBalance);

		//Account balance after adding Balance-Interest
		print("\nAccount balances + interest : ")
		var interestList=interest(bank);
		interestList.foreach(x=>print(x+" "));

		println("\n-------------------------------------");
	}

	val overdraft=(list:List[account])=>list.filter(x=>x.aBalance<=0);
	val balance=(list:List[account])=>list.reduce((x,y)=>new account("V000",1000,x.aBalance+y.aBalance));
	val interest=(list:List[account])=>list.map(x=>(if(x.aBalance>0) x.aBalance*0.05d else x.aBalance*0.1d));
}
