package com.javatutorial;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("ENTER ID:");
            int empID = in.nextInt();
            System.out.println("ENTER DEPARTMENT");
            String department = in.next();
            switch(empID){
                case 1:
                    System.out.println("Goku");
                    break;
                case 2:
                    System.out.println("Luffy");
                    break;
                case 3:
                    switch(department){
                        case "DBZ":
                            System.out.println("Dragon ball");
                            break;
                        case "Onepiece":
                            System.out.println("one piece");
                            break;
                    }
            }
        }
    }
}
