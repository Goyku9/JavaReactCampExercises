package inheritance;

public class Main {

	public static void main(String[] args) {
	
		
		 IndividualCustomer �yk� = new IndividualCustomer();	
		 �yk�.customerNumber = "9999";
		 
		 CorporateCustomer n11 = new CorporateCustomer();
		 n11.customerNumber = "1111";
		 
		 SendikaCustomer send = new SendikaCustomer();
		 send.customerNumber = "ssss";
		 
		 Customer[] customers = {�yk�, n11,send};
		 
		 CustomerManager cManager = new CustomerManager();
		 
		 cManager.add(send);
	          
		  cManager.multipleAdd(customers);
	}

}
