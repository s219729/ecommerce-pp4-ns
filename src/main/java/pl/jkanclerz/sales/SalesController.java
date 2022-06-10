package pl.jkanclerz.sales;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jkanclerz.sales.offerting.Offer;

@RestController
public class SalesController {
    //@ToDo implement session id
    public static final String CUSTOMER_ID = "Kuba";

    Sales sales;

    public SalesController(Sales sales) {
        this.sales = sales;
    }

    @GetMapping("/api/sales/current-offer")
    Offer getCurrentOffer() {
        return sales.getCurrentOffer(getCurrentClientId());
    }

    private String getCurrentClientId() {
        return CUSTOMER_ID;
    }
}
