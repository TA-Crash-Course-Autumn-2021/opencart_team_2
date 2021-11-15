package repository;

import models.AppleCinemaModel;
import org.apache.commons.lang.RandomStringUtils;

public class AppleCinemaModelRepository {

    private AppleCinemaModelRepository() {}

    public static AppleCinemaModel getAppleCinemaModel() {
        return AppleCinemaModel.builder()
                .radio(5)
                .checkbox(8)
                .text(RandomStringUtils.randomAlphabetic(5))
                .select(2)
                .textarea(RandomStringUtils.randomAlphabetic(4))
                .file("src/test/resources/Test.txt")
                .date("2021-02-20")
                .time("20:21")
                .dateAndTime("2021-02-20 20:21")
                .qty("3")
                .build();
    }
}
