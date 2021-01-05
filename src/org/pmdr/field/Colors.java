package org.pmdr.field;

public enum Colors {
    BLACK("1"),
    YELLOW("2"),
    RED("3"),
    BLUE("4"),
    ORANGE("5"),
    PINK("6"),
    MAGENTA("7"),
    CYAN("8"),
    GREEN("9");



    private String index;


    Colors(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

}
