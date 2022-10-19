package com.javatutorial;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a fruit");
            String fruit = in.next();
            switch(fruit){
                case "Mango":
                System.out.println("king of fruits");
                break;
                case "Apple":
                System.out.println("sweet red frut");
                break;
                case "Grape":
                System.out.println("Small green fruit");
                default:
                System.out.println("Mango,Apple,Grape");
        }
    }
}
}