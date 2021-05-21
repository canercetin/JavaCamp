
public abstract class BaseCustomerManager implements CustomerService {

	public void save(Customer customer) {		
		System.out.println("Customer Saved: "+customer.firstName+" "+customer.lastName);		
	}	
	
}
