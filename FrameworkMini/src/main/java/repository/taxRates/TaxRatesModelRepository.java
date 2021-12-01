package repository.taxRates;

import models.TaxRatesModel;

public class TaxRatesModelRepository {

    private TaxRatesModelRepository() {
    }

    public static TaxRatesModel getTaxRatesModel() {
        return TaxRatesModel.builder()
                .taxName("Federal income tax")
                .taxRate("24.0000")
                .type("P")
                .geoZone("3")
                .build();
    }

    public static TaxRatesModel getTaxRatesModelCarbon() {
        return TaxRatesModel.builder()
                .taxName("Carbon tax")
                .taxRate("3")
                .type("P")
                .geoZone("3")
                .build();
    }
}
