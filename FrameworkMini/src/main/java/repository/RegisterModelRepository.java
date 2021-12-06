package repository;

import models.RegisterModel;
import org.apache.commons.lang.RandomStringUtils;

public class RegisterModelRepository {

    private RegisterModelRepository() {
    }

    public static RegisterModel getRegisterModel() {
        String password = RandomStringUtils.randomAlphabetic(7);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getRegisterModelConstant() {
        String password = "1234";
        return RegisterModel.getBuilder()
                .firstName("1234")
                .lastName("1234")
                .email(RandomStringUtils.randomAlphabetic(5) +  "@gmail.com")
                .telephone("9999999999")
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getRegisterModelInEmail(String email) {
        String password = "1234";
        return RegisterModel.getBuilder()
                .firstName("1234")
                .lastName("1234")
                .email(email +  "@gmail.com")
                .telephone("9999999999")
                .password(password)
                .passwordConfirm(password)
                .build();
    }
}
