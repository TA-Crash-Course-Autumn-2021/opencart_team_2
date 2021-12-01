package repository.taxRates;

import models.TaxRatesModel;

public class TaxRatesEditModelRepository {

    private TaxRatesEditModelRepository() {
    }

    public static TaxRatesModel getTaxRatesModel() {
        return TaxRatesModel.builder()
                .taxName("Federal tax")
                .taxRate("35.0000")
                .type("P")
                .geoZone("3")
                .build();
    }
}
