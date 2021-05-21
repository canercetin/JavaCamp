
public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckManager customerCheckManager = new CustomerCheckManager();
	
	@Override
	public void save(Customer customer) {		
		if(customerCheckManager.CheckIfRealPerson(customer))
		{
			System.out.println("*Starbucks* Customer Saved: "+customer.firstName+" "+customer.lastName);	
		}
		else
		{
			System.out.println("Invalid Person!");
		}
			
	}

}
