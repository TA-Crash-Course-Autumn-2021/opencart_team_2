package repository.taxClass;

import models.TaxClassesModel;

public class TaxClassEditModelRepository {

    private TaxClassEditModelRepository() {
    }

    public static TaxClassesModel getTaxClassesModel() {
        return TaxClassesModel.builder()
                .taxClassTitle("Sales")
                .description("Sales taxes are taxes imposed as a percentage of firms’ sales")
                .taxRate("Eco Tax (-2.00)")
                .basedOn("shipping")
                .priority("2")
                .build();
    }

    public static TaxClassesModel getTaxClassesModelEdit() {
        return TaxClassesModel.builder()
                .taxClassTitle("Sales")
                .description("Sales taxes are taxes imposed as a percentage of firms’ sales")
                .taxRate("Carbon tax")
                .basedOn("shipping")
                .priority("1")
                .build();
    }
}
