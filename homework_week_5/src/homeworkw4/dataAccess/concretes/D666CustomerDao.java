package homeworkw4.dataAccess.concretes;

import java.util.List;
import homeworkw4.dataAccess.abstracts.CustomerDao;
import homeworkw4.entities.concretes.Customer;
import homeworkw4.entities.concretes.CustomerDatabase;

public class D666CustomerDao implements CustomerDao {

	private CustomerDatabase customerDatabase;
	
	public D666CustomerDao(CustomerDatabase customerDatabase) {
		super();
		this.customerDatabase = customerDatabase;
	}

	@Override
	public void add(Customer customer) {
		System.out.println("Added by D666: "+customer.getEmail());
		customerDatabase.customerDatabase1.add(customer);
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted by D666: "+customer.getEmail());
		customerDatabase.customerDatabase1.remove(customer);
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Updated by D666: "+customer.getEmail());
		
	}

	@Override
	public Customer get(String mail) {
		for (int i = 0; i < getAll().size(); i++) 
		{
				if(getAll().get(i).getEmail() == mail) 
				{
					return getAll().get(i);
				}				
		}
		System.out.println("ERROR: Customer not found!");
		return null;		
	}

	@Override
	public List<Customer> getAll() {		
		return customerDatabase.customerDatabase1;
	}
	
}
