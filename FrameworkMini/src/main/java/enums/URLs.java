package enums;

//https://demo.opencart.com/index.php?route=common/home
//http://localhost/opencart/upload/index.php
public enum URLs {
    BASE_URL("http://localhost/opencart/upload/index.php");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
