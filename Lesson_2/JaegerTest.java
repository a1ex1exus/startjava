public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Tacit Ronin");
        System.out.println("Print the value in the main method: " + jaeger1.getModelName());
        jaeger1.setGeneration(6);
        System.out.println("Print the value in the main method: " + jaeger1.getGeneration());
        jaeger1.setDestroyed(false);
        System.out.println("Print the value in the main method: " + jaeger1.getIsDestroyed());
        jaeger1.call();
        jaeger1.speak();

        Jaeger jaeger2 = new Jaeger();
        String p1 = "Scrapper";
        jaeger2.setModelName(p1);
        int p2 = 2;
        jaeger2.setGeneration(p2);
        boolean p3 = true;
        jaeger2.setDestroyed(p3);
        System.out.println(jaeger2.getModelName() + ", " + jaeger2.getGeneration() + ".th generation, was destroyed?\n" + "It's " + jaeger2.getIsDestroyed() + ".\n");
        jaeger2.speak();
        jaeger2.call();
    }
}