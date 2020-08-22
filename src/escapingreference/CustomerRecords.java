package escapingreference;

import java.util.HashMap;
import java.util.Map;

public class CustomerRecords {

	private Map<String, Customer> records;

	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
	
	public Map<String, Customer> getCustomer() {
		return new HashMap<String, Customer>(this.records);
	}
	
	public CustomerReadOnly getCustomerByName(String name) {
		return this.records.get(name);
	}
}
