package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer �yk� = new Customer(1, "�yk�", "y�ksel");
		Customer ilkay = new Customer(2,"ilkay", "y�ksel");
		customerManager.add(�yk�);
		customerManager.delete(ilkay);
	}

}
