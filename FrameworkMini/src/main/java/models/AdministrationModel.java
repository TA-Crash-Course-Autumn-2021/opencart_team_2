package models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AdministrationModel {

    private String username;
    private String password;
}
