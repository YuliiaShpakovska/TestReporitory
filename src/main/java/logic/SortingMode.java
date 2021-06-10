package logic;

public enum SortingMode {
    LENGTH_ASC("LENGTH", "ASC"),
    LENGTH_DESC("LENGTH", "DESC"),
    POWER_ASC("POWER", "ASC"),
    POWER_DESC("POWER", "DESC"),
    YEAR_ASC("YEAR", "ASC"),
    YEAR_DESC("YEAR", "DESC"),
    SPEED_ASC("SPEED", "ASC"),
    SPEED_DESC("SPEED", "DESC"),
    NAME_ASC("NAME", "ASC"),
    NAME_DESC("NAME", "DESC"),
    DISPLACEMENT_ASC("DISPLACEMENT", "ASC"),
    DISPLACEMENT_DESC("DISPLACEMENT", "DESC");


    private String param;
    private String mode;

    SortingMode(String param, String mode) {
        this.param = param;
        this.mode = mode;
    }

    public String getParam() {
        return param;
    }

    public String getMode() {
        return mode;
    }
}
