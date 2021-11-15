package models;

import lombok.Getter;

@Getter
//@Builder
//патерн білдер
public class LoginModel {

    private String email;
    private String password;

    LoginModel() {
    }
    public static Builder getBuilder() {
        return new LoginModel().new Builder();
    }

    public class Builder {
        public Builder email(String value) {
            email = value;
            return this;
        }
        public Builder password(String value) {
            password = value;
            return this;
        }
        public LoginModel build() {
            return LoginModel.this;
        }
    }
}