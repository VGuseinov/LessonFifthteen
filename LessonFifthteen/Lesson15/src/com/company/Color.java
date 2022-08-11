package com.company;

public enum Color {
    red("#ff0000"),
    green("0000ff"),
    blue("#00ff00");

    //  в enum можно объявить конструктор, но он будет с модификатором private
    Color(String color) {
        this.hexColor = color;
    }

    public String getHexColor() {
        return hexColor;
    }

    private String hexColor;
}
