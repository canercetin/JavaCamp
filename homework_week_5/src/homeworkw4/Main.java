package homeworkw4;

import homeworkw4.business.abstracts.CustomerService;
import homeworkw4.business.concretes.CustomerManager;
import homeworkw4.core.adapter.GoogleAccountManagerAdapter;
import homeworkw4.core.mailCheck.concretes.MailCheckManager;
import homeworkw4.dataAccess.concretes.D666CustomerDao;
import homeworkw4.entities.concretes.Customer;
import homeworkw4.entities.concretes.CustomerDatabase;

public class Main {

	public static void main(String[] args) {
				
		CustomerService customerService = new CustomerManager(new D666CustomerDao(new CustomerDatabase()), 
										  					  new MailCheckManager(), new GoogleAccountManagerAdapter());
		
		Customer customer1 = new Customer("Customer", "One", "customer1@gmail.com", "123asdf");
		Customer customer2 = new Customer("Customer", "Two", "customer2@gmail.com", "222222");
		Customer customer3 = new Customer("Customer", "Three", "customer3@gmail", "333333");
		Customer customer4 = new Customer("Customer", "Four", "customer4@gmail.com", "4444444");
		
		customerService.register(customer1);
		customerService.register(customer2);
		customerService.register(customer3);
		customerService.register(customer4);
		
		customerService.signIn("customer1@gmail.com", "123asdf");
		customerService.signIn("customer2@gmail.com", "11111");
		customerService.signIn("customer4@gmail.com", "222222");
		customerService.signIn("customer4@gmail.com", "4444444");
		
		customerService.signInByExternalSystem();
		
		
		
		
		
	}

}
