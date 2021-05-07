package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerMng = new CustomerManager();
		customerMng.databaseMng = new OracleDatabaseManager();
		customerMng.getCustomers();

	}

}
