package kit.bank;

public class BankAccount {
    public int accno;
	public String accholder;
	public double bal;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccholder() {
		return accholder;
	}
	public void setAccholder(String accholder) {
		this.accholder = accholder;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public BankAccount(int accno, String accholder, double bal) {
		super();
		this.accno = accno;
		this.accholder = accholder;
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", accholder=" + accholder + ", bal=" + bal + "]";
	}
	
}
