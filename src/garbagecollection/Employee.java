package garbagecollection;

public class Employee {
	
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	public void finalize() {
		System.out.println("This object is being gc'd.");
	}

}
