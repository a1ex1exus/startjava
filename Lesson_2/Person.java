public class Person {

    String sex = "Male";
    String name = "Arthur";
    String nativeLanguage = "French";
    float height = 1.81f;
    int weight = 75;
    int walkingSpeed = 6;
    int runningSpeed = 10;
    int age = 50;

    void walk() {
        System.out.println(name + " goes at a speed of " + walkingSpeed + " km per hour");
    }

    void run() {
        System.out.println(name + " runs at speed " + runningSpeed + " km per hour");
    }

    void speak() {
        System.out.println(name + " speaks " + nativeLanguage);
    }

    void learnJava() {
    }

    boolean wake() {
        System.out.println(name + "is sleeping");
        return false;
    }

    String read() {
        return "nothing";
    }
}

