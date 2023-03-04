import Abstract.Logger;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Utilities.DatabaseLogger;
import Utilities.EmailLogger;
import Utilities.FileLogger;
import Utilities.SmsLogger;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        Customer gamer1 = new Customer(1, "Hasan Ümit",
                "Sinanoğlu", "john.doe@example.com",
                "1ABCX12345", "john.doe@example.com",
                Long.parseLong("24937031166"), new Date(1980, Calendar.MARCH, 23));

        Logger databaseLogger = new DatabaseLogger();
        Logger emailLogger = new EmailLogger();

        Game game1 = new Game(1, "Assasins Creed: Valhalla", 12);
        Campaign campaign1=new Campaign(1, "Üniversite ", 10);

        CustomerManager customerman = new CustomerManager(new MernisServiceAdapter(), databaseLogger);
        GameManager gameman = new GameManager();
        CampaignManager campaignman = new CampaignManager();
        SalesManager salesman = new SalesManager(databaseLogger);

        customerman.Add(gamer1);
        gameman.Add(game1);
        campaignman.Add(campaign1);
        salesman.Sales(gamer1, game1);
        salesman.SalesWithCampaign(gamer1, campaign1, game1);


    }
}
