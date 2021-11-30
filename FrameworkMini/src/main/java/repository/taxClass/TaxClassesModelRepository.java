package repository.taxClass;

import models.TaxClassesModel;

public class TaxClassesModelRepository {

    private TaxClassesModelRepository() {
    }

    public static TaxClassesModel getTaxClassesModel() {
        return TaxClassesModel.builder()
                .taxClassTitle("Sales Taxes")
                .description("Sales taxes are taxes imposed as a percentage of firms’ sales")
                .taxRate("86")
                .basedOn("store")
                .priority("1")
                .build();
    }
}
