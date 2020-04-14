public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Gender = " + wolfOne.getGender());
        wolfOne.setGender("");

        System.out.println("Nickname = " + wolfOne.getNickname());
        wolfOne.setNickname("Shaggy");
        System.out.println("New wolf nickname = " + wolfOne.getNickname());

        System.out.println("Color = " + wolfOne.getColor());
        wolfOne.setColor("Grey");
        System.out.println("New wolf color = " + wolfOne.getColor());

        System.out.println("Weight = " + wolfOne.getWeight());

        System.out.println("Age = " + wolfOne.getAge());
        wolfOne.setAge(9);

        wolfOne.go();

        wolfOne.sit();

        wolfOne.run();

        wolfOne.howl();

        wolfOne.hunt();
    }
}