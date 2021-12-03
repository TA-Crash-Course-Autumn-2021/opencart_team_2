package repository;

import models.AdministrationModel;

public class AdministrationModelRepository {
    private AdministrationModelRepository() {}

    public static AdministrationModel getAdministrationModel() {
        return AdministrationModel.builder()
                .username("admin")
                .password("admin")
                .build();
    }
}
