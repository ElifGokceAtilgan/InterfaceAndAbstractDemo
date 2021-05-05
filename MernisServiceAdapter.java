import java.rmi.RemoteException;

import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	public boolean CheckIfRealPerson(Customer customer) {
	  KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	  boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula( customer.getIdentityNumber(), customer.getFirstName(), customer.getLastName(),customer.getBirthYear());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return result;
		}

}
