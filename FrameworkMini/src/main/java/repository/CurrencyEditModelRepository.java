package repository;

import models.CurrencyModel;

public class CurrencyEditModelRepository {

    private CurrencyEditModelRepository() {
    }

    public static CurrencyModel getCurrencyEditModel() {
        return CurrencyModel.builder()
                .currencyTitle("Hryvnia")
                .code("UAH")
                .symbolRight("₴")
                .decimalPlaces("3")
                .value("0.03765")
                .status(1)
                .build();
    }
}


