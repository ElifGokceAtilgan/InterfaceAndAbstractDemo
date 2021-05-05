

public class StarbucksCustomerManager extends BaseCustomerManager{
private CustomerCheckService customerCheckService;
public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
super();
this.customerCheckService = customerCheckService;
}
	
	@Override
	public void save(Customer customer)  {
		if(CustomerCheckService.CheckIfRealPerson(customer)) {
			save(customer);
		}else {
			System.out.println("Not a valid person"); 
		}
		
	}
	
	
	
}


