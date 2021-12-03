package repository.taxRates;

import models.TaxRatesModel;

public class TaxRatesEditModelRepository {

    private TaxRatesEditModelRepository() {
    }

    public static TaxRatesModel getTaxRatesEditModel() {
        return TaxRatesModel.builder()
                .taxName("Federal tax")
                .taxRate("35.0000")
                .type("Percentage")
                .geoZone("UK Shipping")
                .build();
    }
}
