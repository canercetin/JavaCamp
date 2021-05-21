
public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("123","Caner","Çetin","04/05/2001","12345678910");
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager();
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
				
		starbucksCustomerManager.save(customer1);
		neroCustomerManager.save(customer1);
		
	}

}
