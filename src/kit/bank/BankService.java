package kit.bank;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class BankService {
	private final List<BankAccount> bankacc=new ArrayList<>();
	 private List<Transaction> transactions = new ArrayList<>();

	public void createAcc(BankAccount bankaccount ) {
		bankacc.add(bankaccount);
		System.out.println("Account created successfully.");
	}

	
	 public void viewAcc(int accno) {
	        boolean found = false;
	        for (BankAccount acc : bankacc) {
	            if (acc.getAccno() == accno) {
	                System.out.println(acc);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Account number " + accno + " not found.");
	        }
	    }

	public BankAccount findAccount(int accno) {
        for (BankAccount bankaccount : bankacc) {
            if (bankaccount.getAccno() == accno) {
                return bankaccount;
            }
        }
        return null;
    }


  public void deposit(int accno,int amount){
	  BankAccount bankaccount = findAccount(accno);
      if (bankaccount != null) {
          if (amount > 0) {
        	  bankaccount.setBal(bankaccount.getBal() + amount);
              System.out.println("Deposit successful. New balance: " + bankaccount.getBal());
          } else {
              System.out.println("Invalid deposit amount.");
          }
      } else {
          System.out.println("Account number " + accno + " not found.");
      }
  }
	  
  public void withdraw(int accno,int amount){
	 BankAccount bankaccount = findAccount(accno);
      if (bankaccount != null) {
          if (amount > 0 && amount <= bankaccount.getBal()) {
              bankaccount.setBal(bankaccount.getBal() - amount);
              System.out.println("Withdrawal successful. New balance: " + bankaccount.getBal());
          } else {
              System.out.println("Insufficient balance.");
          }
      } else {
          System.out.println("Account number " + accno + " not found.");
      }
  }
 



public void transfer(int senderAccno,int receiverAccno,int amount){
        BankAccount fromAcc = findAccount(senderAccno);
        BankAccount toAcc = findAccount(receiverAccno);


        if (fromAcc == null) {
            System.out.println("Source account " +senderAccno  + " not found.");
            return;
        }
        if (fromAcc.getBal() < amount) {
            System.out.println("Insufficient balance in source account.");
            return;
        }

        fromAcc.setBal(fromAcc.getBal() - amount);
        toAcc.setBal(toAcc.getBal() + amount);

        System.out.println("Account number" +senderAccno+ " Transfer successful to "+ receiverAccno);
        System.out.println("Sender account balance after transfer: " + fromAcc.getBal());
        System.out.println("receiver account balance after transfer: " + toAcc.getBal());
}
public void transactionhistory(int accno){
	for(Transaction trans:transactions) {
		if(trans.accno==accno) {
			System.out.println(trans);
		}
		else {
			System.out.println("No transaction");
		}
	}
}
    
	private static String getDate() {
		return java.time.LocalDate.now().toString();
	}

}

