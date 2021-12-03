package enums;

public enum User {
    PASSWORD("1234");

    private final String value;

    User(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

