package repository;

import models.CurrencyModel;
//https://www.xe.com/iso4217.php - full list of ISO currency codes and settings

public class CurrencyModelRepository {

    private CurrencyModelRepository() {
    }

    public static CurrencyModel getCurrencyModel() {
        return CurrencyModel.builder()
                .currencyTitle("Ukrainian Hryvnia")
                .code("UAH")
                .symbolRight("₴")
                .decimalPlaces("2")
                .value("0.0376578")
                .status(1)
                .build();
    }
}
