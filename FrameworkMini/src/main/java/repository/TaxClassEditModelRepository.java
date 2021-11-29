package repository;

import models.TaxClassesModel;

public class TaxClassEditModelRepository {

    private TaxClassEditModelRepository() {
    }

    public static TaxClassesModel getTaxClassesModel() {
        return TaxClassesModel.builder()
                .taxClassTitle("Sales")
                .description("Sales taxes are taxes imposed as a percentage of firms’ sales")
                .taxRate("86")
                .basedOn("store")
                .priority("2")
                .build();
    }
}
