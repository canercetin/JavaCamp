package homeworkw4.business.concretes;

import homeworkw4.business.abstracts.CustomerService;
import homeworkw4.core.adapter.ExternalSignInService;
import homeworkw4.core.mailCheck.abstracts.MailCheckService;
import homeworkw4.dataAccess.abstracts.CustomerDao;
import homeworkw4.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private MailCheckService mailCheckService;	
	private CustomerDao customerDao;	
	private ExternalSignInService externalSignInService;
	
	public CustomerManager(CustomerDao customerDao, MailCheckService mailCheckService, ExternalSignInService externalSignInService) {
		super();
		this.customerDao = customerDao;
		this.mailCheckService = mailCheckService;
		this.externalSignInService = externalSignInService;
	}

	@Override
	public void register(Customer customer) {
		if(customer.getPassword().length() < 6)
		{
			System.out.println("ERROR: Password must be more than 6 characters!");
			System.out.println();
			return;
		}
		if(!this.mailCheckService.checkMail(customer.getEmail()))
		{
			System.out.println("ERROR: Invalid mail address!");
			System.out.println();
			return;
		}		
		for (Customer customer1 : customerDao.getAll()) 
		{
			if(customer1.getEmail() == customer.getEmail())
			{
				System.out.println("ERROR: This mail address already in use!");
				System.out.println();
				return;
			}
		}		
		if(customer.getFirstName().length() < 2 || customer.getLastName().length() < 2)
		{
			System.out.println("ERROR: Name and last name must be more then 2 characters!");
			System.out.println();	
			return;
		}
		mailCheckService.sendVerification(customer.getEmail());
		if(mailCheckService.verificationFeedback(customer.getEmail()))
		{
			System.out.println("Mail address verified!");
			//System.out.println(" ");
			this.customerDao.add(customer);
			System.out.println();		
		}		
		
	}

	@Override
	public void signIn(String email, String password) {
		for (Customer customer1 : customerDao.getAll()) {
			if(customer1.getEmail() == email && customer1.getPassword() == password)
			{
				System.out.println("Signed In! "+customer1.getFirstName()+" "+customer1.getLastName());
				return;
			}			
		}
		System.out.println("EEROR: Wrong user information, please try again!");		
	}

	public void signInByExternalSystem() {
		externalSignInService.signInSystem();
	}
	
	@Override
	public void changePassword(String email, String password, String newPassword) {
		// TODO Auto-generated method stub
		
	}

}
