package repository;

import models.CheckoutModel;
import org.apache.commons.lang.RandomStringUtils;

public class CheckoutModelRepository {
    private CheckoutModelRepository(){}

    public static CheckoutModel getCheckoutModel() {
        return CheckoutModel.builder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .address1(RandomStringUtils.randomAlphabetic(5))
                .city(RandomStringUtils.randomAlphabetic(7))
                .postCode(RandomStringUtils.randomAlphabetic(5))
                .country(2)
                .region_state(37)
                .build();
    }
}
