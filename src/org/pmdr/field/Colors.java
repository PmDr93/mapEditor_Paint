package org.pmdr.field;

public enum Colors {
    BLACK("1"),
    BLUE("2"),
    RED("3"),
    YELLOW("4"),
    ORANGE("5"),
    PINK("6"),
    MAGENTA("7"),
    CYAN("8"),
    GREEN("9");

    //each color has a index
    private String index;

    Colors(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

}
