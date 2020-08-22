package escapingreference;

public class Main {

	public static void main(String[] args) {

		CustomerRecords records = new CustomerRecords();
		records.addCustomer(new Customer("Jerald"));
		records.addCustomer(new Customer("Layah"));
		
		for (Customer nxt : records.getCustomer().values()) {
			System.out.println(nxt);
		}
		
		;
		
	}

}
