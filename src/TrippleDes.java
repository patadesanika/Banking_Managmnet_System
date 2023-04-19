import java.util.*;
class TrippleDes{
	
	public static void main (String[] args)
	   {
		
		int amt;
		int tax=2;
		int total_tax;
		int charges;
		int final_amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your amount");
		amt=sc.nextInt();
		total_tax=amt*tax/100;
		System.out.println("total tax is: "+total_tax);
		
		if(amt>=1 && amt<=10000)
		{
			charges=2+total_tax;
			final_amount=amt-charges;
			System.out.println("total charges id: "+charges);
			System.out.println("final amount is: "+final_amount);
		}
		else if(amt>=10000 && amt<=100000){
			charges=5+total_tax;
			final_amount=amt-charges;
			System.out.println("total charges id: "+charges);
			System.out.println("final amount is: "+final_amount);

		}
		else if(amt>=100000 && amt<=200000)
		{
				charges=15+total_tax;
				final_amount=amt-charges;
				System.out.println("total charges id: "+charges);
				System.out.println("final amount is: "+final_amount);

		}
		else if(amt>=200000 && amt<=2500000) 
		{
				charges=25+total_tax;
				final_amount=amt-charges;
				System.out.println("total charges ids "+charges);
				System.out.println("final amount is: "+final_amount);

		}	
	  }
		   
}