
public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer)
	{
		System.out.println("*Nero* Customer Saved: "+customer.firstName+" "+customer.lastName);
	}
	
}
