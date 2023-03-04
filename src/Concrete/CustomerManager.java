package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Abstract.Logger;
import Entities.Customer;

public class CustomerManager implements ICustomerService {

    private ICustomerCheckService _customerCheckService;
    private Logger logger;

    public CustomerManager(ICustomerCheckService _customerCheckService, Logger logger) {
        super();
        this._customerCheckService = _customerCheckService;
        this.logger = logger;
    }

    @Override
    public void Add(Customer customer) throws Exception {
        if (_customerCheckService.checkIfRealPerson(customer))
            LoggerManager.run(logger, "Gamer " + customer.getFirstName() + " " + customer.getLastName() + " registered to the Customer Database");
        else
            LoggerManager.run(logger, "Not a valid person");

    }

    @Override
    public void Delete(Customer customer) {
        LoggerManager.run(logger, "Deleting " + customer.getFirstName() + " " + customer.getLastName());
    }

    @Override
    public void Update(Customer customer) {
        LoggerManager.run(logger, "Updating " + customer.getFirstName() + " " + customer.getLastName());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
