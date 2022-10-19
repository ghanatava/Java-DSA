package com.javatutorial;

public class Condiotionals {
    public static void main(String[] args) {
        int salary = 25000;
        if(salary >= 10000){
            salary=salary+2000;
        }
        else if(salary >= 20000){
            salary = salary+4000;
        }
        else{
            salary = salary+1000;
        }
        System.out.println("new salary = "+salary);
    }
}
