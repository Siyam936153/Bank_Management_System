package kit.bank;
import java.util.List;
import java.util.ArrayList;


public class TransectionService {
	 
	 private List<Transaction> transactions = new ArrayList<>();
	 
	 public void recordtransaction(Transaction transaction) {
		 transactions.add(transaction);
	 }
	 public void gettransaction(int accno) {
			 for(Transaction trans:transactions) {
					if(trans.accno==accno) {
						System.out.println(trans);
					}
					else {
						System.out.println("No transaction");
					}
				}
			}
	    
}