import java.util.Scanner;
public class IMPS extends TestFundTransfer{
void printIMPS() {
	System.out.println("*******************************************");
	   System.out.println(" transfer to bank IMPS");
	   System.out.println("*******************************************");
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter your benficiary_name");
	   String benficiary_name=sc.next();
	   
	   System.out.println("enter your benficiary IFSC_code");
	   String IFSC_code=sc.next();
	   
	   System.out.println("enter our benficiary account_NO");
	   int account_no=sc.nextInt();
	   
	   System.out.println("enter your transfer_amount");
	   int transfer_amount=sc.nextInt();
	   try {
	   if(transfer_amount>=1 && transfer_amount<=200000) {		   
		   System.out.println("yess!! you can trnasfer");
			throw new IllegalArgumentException("argument must be positive");

	   }
	   else {
		   System.out.println("sorry!!you can't transfer");
	   }
	   }catch(IllegalArgumentException e) {
		   System.out.println(e);
		   e.printStackTrace();
	   }
	   
	
}
}
