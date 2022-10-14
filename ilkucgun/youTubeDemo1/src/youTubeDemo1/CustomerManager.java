package youTubeDemo1;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
	  this.customer = customer;
	  this.creditManager = creditManager;
	}

	public void save() {
		System.out.println("müşteri kaydedildi : " );
	}
	
	public void delete() {
		System.out.println("müşteri silindi : " );
	}
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("kredi verildi");
	}
}
