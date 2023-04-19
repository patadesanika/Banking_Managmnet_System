import java.time.LocalTime;
import java.util.Scanner;
public class NEFT extends TestFundTransfer {
	String benficiary_name;
	String IFSC_code;
	int account_no;
	int transfer_amount;
	String reason;
	void printNEFT() {
		Scanner sc=new Scanner(System.in);//decalre Scanner class
		System.out.println("*******************************************");
		   System.out.println("transfer to bank NEFT");
		   System.out.println("*******************************************");
		   LocalTime now = LocalTime.now();
			LocalTime current_timeNEFT = LocalTime.parse( "07:00" );
			LocalTime current_time1NEFT = LocalTime.parse( "19:00" );

			Boolean LateNEFT = now.isAfter( current_timeNEFT );
			Boolean beforeNEFT = now.isBefore(current_time1NEFT );
			if( LateNEFT== true && beforeNEFT==true) {
		System.out.println("enter your benficiary_name");
		  benficiary_name=sc.next();
		   
		   System.out.println("enter your benficiary IFSC_code");
		  IFSC_code=sc.next();
		   
		   System.out.println("enter our benficiary account_NO");
		  account_no=sc.nextInt();
	
		   System.out.println("enter your transfer_amount");
		    transfer_amount=sc.nextInt();
		    	 
		    if(transfer_amount>=1 && transfer_amount<=2500000) {
				   System.out.println("yes!! you can transfer");
		    }
		    			   
		    	   int amt;
					int tax=2; 
					int total_tax;
					int charges;
					int final_amount;
					System.out.println("Please confirm your amount");
					amt=sc.nextInt();
					total_tax=amt*tax/100;
					System.out.println("total tax is: "+total_tax);
				try {
					
					if(amt>=1 && amt<=10000)
					{
						charges=2+total_tax;
						final_amount=amt-charges;
						System.out.println("total charges id: "+charges);
						System.out.println("final amount is: "+final_amount);
						throw new IllegalArgumentException("argument must be positive");
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
					else {
				   System.out.println("sorry!!you cannot transfer");
					}
				}
					catch(IllegalArgumentException e1){
						e1.printStackTrace();
					}
				catch(Exception e) {
					System.out.println("exception is" +e);
				}
	}//time

	  else {
        	 
			System.out.println("NEFT can only transfer between 7AM To 7PM");
			}
	
		}//method
}//class

