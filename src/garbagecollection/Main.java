package garbagecollection;

public class Main {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();

		Long availableBytes = runtime.freeMemory();

		System.out.println("Available Memory " + availableBytes / 1024 + "k");

		for (int i = 0; i <= 100; i++) {
			Employee e;
			e = new Employee("Jearld");
		}

		availableBytes = runtime.freeMemory();

		System.out.println("Available Memory " + availableBytes / 1024 + "k");
		
		System.gc();
		
		availableBytes = runtime.freeMemory();

		System.out.println("Available Memory " + availableBytes / 1024 + "k");
	}

}
