package pl.jkanclerz.productcatalog;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqlProductStorageIntegrationTest {



    void itSotreAndLoadProduct() {
        ProductStorage sqlProductStorage = new SqlProductStorage();
        ProductData sampleProduct = thereIsSampleProductData();

        sqlProductStorage.save(sampleProduct);

        ProductData loaded = sqlProductStorage.loadById(sampleProduct.getId());

        assertEquals(sampleProduct.getName(), loaded.getName());
    }

    private ProductData thereIsSampleProductData() {
        return new ProductData("lego-1", "nice one");
    }
}
