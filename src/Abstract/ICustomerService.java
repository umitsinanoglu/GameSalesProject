package Abstract;

import Entities.Customer;

public interface ICustomerService {
    void Add(Customer customer) throws Exception;
    void Delete(Customer customer);
    void Update(Customer customer);
}
