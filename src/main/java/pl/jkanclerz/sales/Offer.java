package pl.jkanclerz.sales;

import java.math.BigDecimal;

public class Offer {
    public static Offer empty() {
        return new Offer();
    }

    public BigDecimal getTotal() {
        return BigDecimal.ZERO;
    }
}
