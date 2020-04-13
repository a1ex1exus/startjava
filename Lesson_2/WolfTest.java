public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Nickname = " + wolfOne.nickname);
        System.out.println("Color = " + wolfOne.color);
        System.out.println("Weight = " + wolfOne.weight);
        wolfOne.go();

        wolfOne.sit();

        wolfOne.run();

        wolfOne.howl();

        wolfOne.hunt();
    }
}