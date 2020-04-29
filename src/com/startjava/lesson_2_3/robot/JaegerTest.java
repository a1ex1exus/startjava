package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Tacit Ronin", 6, false);
        System.out.println("Print the value in the main method: " + jaeger1.getModelName());
        System.out.println("Print the value in the main method: " + jaeger1.getGeneration());
        System.out.println("Print the value in the main method: " + jaeger1.getIsDestroyed());
        jaeger1.call();
        jaeger1.speak();

        Jaeger jaeger2 = new Jaeger();
        System.out.println(jaeger2.getModelName() + ", " + jaeger2.getGeneration() + ".th generation, was destroyed?\n" + "It's " + jaeger2.getIsDestroyed() + ".\n");
        jaeger2.speak();
        jaeger2.call();
    }
}