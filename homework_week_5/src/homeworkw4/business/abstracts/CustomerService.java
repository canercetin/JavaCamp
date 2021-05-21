package homeworkw4.business.abstracts;

import homeworkw4.entities.concretes.Customer;

public interface CustomerService {

	void register(Customer customer);
	void signIn(String email, String password);
	void signInByExternalSystem();
	void changePassword(String email, String password, String newPassword);
	
}
