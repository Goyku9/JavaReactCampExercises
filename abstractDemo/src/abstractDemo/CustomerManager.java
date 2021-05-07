package abstractDemo;

public class CustomerManager { //BaseDatabaseManagera bağımlı. 
	
	BaseDataBaseManager databaseMng ; //strategy pattern kullancam.
	
	public void getCustomers() {
		
		databaseMng.getData();
	}

}
