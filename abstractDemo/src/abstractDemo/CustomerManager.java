package abstractDemo;

public class CustomerManager { //BaseDatabaseManagera ba��ml�. 
	
	BaseDataBaseManager databaseMng ; //strategy pattern kullancam.
	
	public void getCustomers() {
		
		databaseMng.getData();
	}

}
