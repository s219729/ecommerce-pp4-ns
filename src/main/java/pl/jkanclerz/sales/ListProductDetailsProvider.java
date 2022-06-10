package pl.jkanclerz.sales;

import java.util.List;
import java.util.Optional;

public class ListProductDetailsProvider {
    private List<ProductDetails> availableProducts;

    public ListProductDetailsProvider(List<ProductDetails> availableProducts) {

        this.availableProducts = availableProducts;
    }

    public Optional<ProductDetails> getById(String productId) {
        return availableProducts.stream()
                .filter(productDetails -> productDetails.getProductId().equals(productId))
                .findFirst();
    }
}
