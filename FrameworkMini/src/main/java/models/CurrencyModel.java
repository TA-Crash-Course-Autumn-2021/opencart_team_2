package models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CurrencyModel {

    private String currencyTitle;
    private String code;
    private String symbolLeft;
    private String symbolRight;
    private String decimalPlaces;
    private String value;
    private int status;
}
