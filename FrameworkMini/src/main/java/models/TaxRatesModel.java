package models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TaxRatesModel {
    private String taxName;
    private String taxRate;
    private String type;
    private String geoZone;
}
