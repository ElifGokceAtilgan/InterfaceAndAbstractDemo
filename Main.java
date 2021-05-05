

public class Main{

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager= new NeroCustomerManager();
        BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1, "Elif", "Atilgan", 12345, 1999));
	   
        customerManager2.save(new Customer(2, "Engin", "Demirog", 11111,1999));
	    
		
		

	}

}
