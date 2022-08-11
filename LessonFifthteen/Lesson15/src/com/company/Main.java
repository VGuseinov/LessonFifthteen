package com.company;

public class Main {

    public static void main(String[] args) {
        // Enum - Перечисление
        Color c = Color.red;
        Color c2 = Color.valueOf("red");
        if (c2 == Color.red) {
            System.out.println("Цвет красный");
        }
        System.out.println(c.ordinal());
        System.out.println(c.getHexColor());

        System.out.println(Calc.div.calc(12, 56.7f));
        System.out.println(Calc.plus.calc(12, 56));
        System.out.println(Calc.malt.calc(12, 56.2f));
        System.out.println(Calc.minus.calc(12, 56));
    }
}
