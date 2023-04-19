import java.time.LocalTime;
import java.util.Scanner;
public class RTGS extends TestFundTransfer {
void printRTGS() {
	Scanner sc=new Scanner(System.in);
	System.out.println("*******************************************");
    System.out.println("transfer to bank RTGS");
	System.out.println("*******************************************");
		 
	 LocalTime just= LocalTime.now();
		LocalTime current_timeRTGS = LocalTime.parse( "09:30" );
		LocalTime current_time1RTGS = LocalTime.parse( "16:00" );

		Boolean LateRTGS = just.isAfter( current_timeRTGS );
		Boolean beforeRTGS = just.isBefore( current_time1RTGS );
		if(LateRTGS== true &&  beforeRTGS==true) {
			 System.out.println("enter your benficiary_name");
			   String benficiary_name=sc.next();
			   
			   System.out.println("enter your benficiary IFSC_code");
			   String IFSC_code=sc.next();
			   
			   System.out.println("enter our benficiary account_NO");
			   int account_no=sc.nextInt();
			   
			   
			   System.out.println("enter your transfer_amount");
			   int transfer_amount=sc.nextInt();
			   try {
			   if(transfer_amount>=200000 && transfer_amount<=1000000) {
				   System.out.println("yes!! you can transfer");
				   int amt;
					int tax=2;
					int total_tax;
					int charges;
					int final_amount;
					System.out.println("Please confirm your amount");
					amt=sc.nextInt();
					total_tax=amt*tax/100;
					System.out.println("total tax is: "+total_tax);
					
					if(amt>=200000 && amt<=500000)
					{
						charges=30+total_tax;
						final_amount=amt-charges;
						System.out.println("total charges id: "+charges);
						System.out.println("final amount is: "+final_amount);
					}
					else if(amt>=500000 && amt<=100000){
						charges=55+total_tax;
						final_amount=amt-charges;
						System.out.println("total charges id: "+charges);
						System.out.println("final amount is: "+final_amount);

					}
			      else {
				   System.out.println("sorry!!you cannot transfer");
			   } 
					
					
	}
			 }catch(Exception e) {
				   System.out.println(e);
			   }	  
		}//time
		
		else {
			System.out.println("RTGS can only transfer between 9:30AM To 4PM");
		}
	  

}//method
}//class
