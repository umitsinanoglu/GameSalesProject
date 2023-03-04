package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import Service.SHAKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService{

    @Override
    public Boolean checkIfRealPerson(Customer customer) throws Exception {
        SHAKPSPublicSoap client = new SHAKPSPublicSoap();
        return client.TCKimlikNoDogrula(customer.getNationalId(), customer.getFirstName(), customer.getLastName(), customer.getBirthYear());

    }
}