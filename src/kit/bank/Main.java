package kit.bank;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		BankService service=new BankService();
		TransectionService service1=new TransectionService();
		Scanner sc=new Scanner(System.in);
				int choice;
                           	
		do {
			System.out.println("\n--- Bank Management System---");
			System.out.println("1. Create Account");
			System.out.println("2. View Account");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Transfer");
             System.out.println("6. View Transaction History");
			System.out.println("7. Exit");
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			sc.nextLine();
                    

			switch(choice) {
			case 1->{
				System.out.print("Enter Accountno:");
				int accno=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Accountholder:");
				String accholder=sc.nextLine();
				System.out.print("Enter Amount:");
				double bal=sc.nextInt();
				service.createAcc(new BankAccount(accno,accholder,bal));

			}
                       case 2-> {
                    	System.out.print("Enter Accountno:");
           				int accno=sc.nextInt();
           				sc.nextLine(); 
           				service.viewAcc(accno);
                       }
			case 3->{
				System.out.print("Enter account no:");
				int accno=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Deposit amount :");
				int amount=sc.nextInt();
				service.deposit(accno,amount);	
			}
			case 4->{
				System.out.print("Enter account no:");
				int accno=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter withdraw amount :");
				int amount=sc.nextInt();
				service.withdraw(accno,amount);	
			}
           case 5->{
                System.out.print("Enter senderaccount no:");
				int senderAccno=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter receiveraccount no:");
				int receiverAccno=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter transaction amount :");
				int amount=sc.nextInt();
				service.transfer(senderAccno,receiverAccno,amount);	
                }
            case 6->{
            	System.out.println("Enter account no");
	            int accno=sc.nextInt();
	            service1.gettransaction(accno);
               }

                       
			case 7-> System.out.println("Exiting...");
			default-> System.out.println("Invalid choice.");
			}
		}
		while(choice!=0);
	}
}

