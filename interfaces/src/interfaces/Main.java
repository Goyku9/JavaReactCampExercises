package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer öykü = new Customer(1, "öykü", "yüksel");
		Customer ilkay = new Customer(2,"ilkay", "yüksel");
		customerManager.add(öykü);
		customerManager.delete(ilkay);
	}

}
