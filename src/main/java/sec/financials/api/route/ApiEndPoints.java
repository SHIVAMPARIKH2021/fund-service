package sec.financials.api.route;

public enum ApiEndPoints {
    VERSION_ONE("v1");

    private final String obj;
    ApiEndPoints(String obj) {
        this.obj = obj;
    }

    String getValue() {
        return obj;
    }
}
