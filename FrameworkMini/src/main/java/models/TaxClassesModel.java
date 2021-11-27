package models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TaxClassesModel {
    private String taxClassTitle;
    private String description;
    private String taxRate;
    private String basedOn;
    private String priority;
}
