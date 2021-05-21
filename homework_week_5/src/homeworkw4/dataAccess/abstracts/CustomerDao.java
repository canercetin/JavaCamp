package homeworkw4.dataAccess.abstracts;

import java.util.List;

import homeworkw4.entities.concretes.Customer;

public interface CustomerDao {

	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer get(String mail);
	List<Customer> getAll();
}
