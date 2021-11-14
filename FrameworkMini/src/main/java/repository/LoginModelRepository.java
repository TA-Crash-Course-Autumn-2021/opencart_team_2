package repository;

import models.LoginModel;

public class LoginModelRepository {
    private LoginModelRepository() {
    }

    public static LoginModel getLoginModel() {
        return LoginModel.getBuilder()
                .email("tana@gmail.com")
                .password("tana")
                .build();
    }
}