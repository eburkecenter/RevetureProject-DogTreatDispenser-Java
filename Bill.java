import java.text.SimpleDateFormat;  
import java.util.Date;   
class Bill {

  private double amount;
  private Date date;
  
  public Bill(double amount, Date date) {
    this.amount = amount;
    this.date = date;
  }
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
  }
  
  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  
  public Double printBill(){
    return amount;
  }
  @Override
  public String toString() {
    return "Billing date: " + this.date + ". Bill amount: $" + this.amount;
  }
  
}