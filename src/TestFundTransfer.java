import java.util.Scanner;
public class TestFundTransfer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************************");
	    System.out.println("login");
		System.out.println("*******************************************");
			   System.out.println("enter your user_ID");
			   String user_ID=sc.next();
		   
			  System.out.println("enter your pasword");
			  String password=sc.next();
			  if(user_ID.equals("admin")&&(password.equals("admin"))){
				  System.out.println("Welcome");
				  int ch;
				  do {
					System.out.println("\n1-NEFT \n2-RTGS \n3-IMPS");
					System.out.println("enter your choice");
					ch=sc.nextInt();
					switch(ch) {
					case 1:
						NEFT n=new NEFT();
						n.printNEFT();
						
					break;
					case 2:
						RTGS r=new RTGS();
						r.printRTGS();
						break;
					case 3:
						IMPS i=new IMPS();
						i.printIMPS();
						break;
					default:System.out.println("invalid range...");
					}
					System.out.println("do you want to continue to press 1");
					ch=sc.nextInt();
				  }while(ch==1);
			  }else {
				 System.out.println("invalid username or password!!"); 
			  }
	}

}
