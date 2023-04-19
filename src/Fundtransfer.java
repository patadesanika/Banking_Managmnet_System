import java.time.LocalTime;
import java.util.Scanner;
public class Fundtransfer
{
   
   public static void main (String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("*******************************************");
	   System.out.println("login");
	   System.out.println("*******************************************");
  
		   System.out.println("enter your user_ID");
		   String user_ID=sc.next();
	   
		  System.out.println("enter your pasword");
		  String password=sc.next();
		  if(user_ID.equals("sanika1806039")&&(password.equals("khushi123"))){
			  System.out.println("Welcome");
			   int ch;
			   do {
			   System.out.println("\n1-NEFT\n2-RTGS\n3-IMPS");
			   System.out.println("enter your choice");
			   ch=sc.nextInt();
			   switch(ch) {
			  
			   case 1:
				   
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
						   String benficiary_name=sc.next();
						   
						   System.out.println("enter your benficiary IFSC_code");
						   String IFSC_code=sc.next();
						   
						   System.out.println("enter our benficiary account_NO");
						   int account_no=sc.nextInt();
						   
						   
						   System.out.println("enter your transfer_amount");
						   int transfer_amount=sc.nextInt();
						   
						   if(transfer_amount>=1 && transfer_amount<=2500000) {
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
						   else {
							   System.out.println("sorry!!you cannot transfer");
						   }
						   
						   System.out.println("enter your reason (what are the reason to transfer your money)");
						   String reason=sc.next();
						   System.out.println("congratulations!your amount is sucessfull transfer"); 			   
						   
				}
					else {
						System.out.println("NEFT can only transfer between 7AM To 7PM");
					}
				  
				   break;
			   case 2:
				   
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
						   }
						   else {
							   System.out.println("sorry!!you cannot transfer");
						   }
						   
						   System.out.println("enter your reason (what are the reason to transfer your money)");
						   String reason=sc.next();
						   System.out.println("congratulations!your amount is sucessfull transfer");   
						   
				}
					else {
						System.out.println("NEFT can only transfer between 9:30AM To 4PM");
					}
				  
				   break;
				   
			   case 3:
				   System.out.println("*******************************************");
				   System.out.println(" transfer to bank IMPS");
				   System.out.println("*******************************************");
				   
				   System.out.println("enter your benficiary_name");
				   String benficiary_name=sc.next();
				   
				   System.out.println("enter your benficiary IFSC_code");
				   String IFSC_code=sc.next();
				   
				   System.out.println("enter our benficiary account_NO");
				   int account_no=sc.nextInt();
				   
				   System.out.println("enter your transfer_amount");
				   int transfer_amount=sc.nextInt();
				   if(transfer_amount>=1 && transfer_amount<=200000) {		   
					   System.out.println("yess!! you can trnasfer");
				   }
				   else {
					   System.out.println("sorry!!you can't transfer");
				   }
				   System.out.println("congratulations!your amount is sucessfull transfer");   

				   break;
				   
				   default:System.out.println("invalid range");
			   }
			   System.out.println("do you want to continue to press 1");
			    ch=sc.nextInt();
			   }while(ch==1);
		  }
		  else {
			  System.out.println("invalid username or password");
		  }
		
	   
   }
}