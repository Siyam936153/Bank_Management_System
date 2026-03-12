package kit.bank;

public class Transaction {
	public int transid;
	public int accno;
	public int amount;
	public String type;
	public String date;
	public int getTransid() {
		return transid;
	}
	public void setTransid(int transid) {
		this.transid = transid;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Transaction(int transid, int accno, int amount, String type, String date) {
		super();
		this.transid = transid;
		this.accno = accno;
		this.amount = amount;
		this.type = type;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transaction [transid=" + transid + ", accno=" + accno + ", amount=" + amount + ", type=" + type
				+ ", date=" + date + "]";
	}

}
