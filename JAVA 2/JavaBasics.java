class Bank{
	private float balance=10000;
	private int accNo;
	public void setBalance(float amt){
    	this.balance=amt;
	}
	public void setAccNo(int acn){
    	this.accNo=acn;
	}
	public float getBalance() {
    	return balance;
	}
	public int getAccNo() {
    	return accNo;
	}
}
public class JavaBasics {
	public static void main(String[] args) {
	System.out.println("Name:Shrishti Sap:1000018109");
    	Bank person=new Bank();
    	person.setBalance(20000);
    	person.setAccNo(1122331);
    	System.out.println("Balance:"+person.getBalance());
    	System.out.println("Acc No:"+person.getAccNo());
	}
}




    

