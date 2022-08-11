package com.company;

public class Main2 {

    public static void main(String[] args) {
//        String v2 = System.getenv("Test2");
//        System.out.println(v2);
//        String v = System.getenv("Test");
//        System.out.println(v);

        int sum = 0;
        for (String v : args) {
            try {
                sum += Integer.valueOf(v);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сумма равна " + sum);
    }
}
