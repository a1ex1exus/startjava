package com.startjava.lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        System.out.println();
        char i = '\33';
            while(i <= 126) {
        System.out.print(i);
            i++;
        }
    }
}