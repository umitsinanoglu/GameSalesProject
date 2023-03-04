package Concrete;

import Abstract.ISalesService;
import Abstract.Logger;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements ISalesService {

    private Logger _logger;

    public SalesManager(Logger logger) {
        _logger = logger;
    }

    @Override
    public void Sales(Customer customer, Game game) {
        LoggerManager.run(_logger, "Game sold to : " + customer.getFirstName() + " " + customer.getLastName());
    }

    @Override
    public void SalesWithCampaign(Customer customer, Campaign campaign, Game game) {
        LoggerManager.run(_logger, "Game sold to : " + customer.getFirstName() + " " + customer.getLastName() + " with the campaign " + campaign.CampaignName);
    }
}
