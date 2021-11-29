package models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CheckoutModel {
    private String firstName;
    private String lastName;
    private String city;
    private String postCode;
    private String address1;
    private int country;
    private int region_state;
    private String email;
    private String telephone;
}
