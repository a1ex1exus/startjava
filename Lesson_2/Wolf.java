public class Wolf {

    private String gender = "Male";
    private String nickname = "Ralf";
    private String color = "black";
    private float weight = 40.5f;
    private int age = 7;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender == "") {
            System.out.println("You entered nothing. Please enter the correct gender.");
        } else {
            this.gender = gender;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
            this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("You entered the wrong age, please correct it.");
        } else {
            this.age = age;
        }
    }

    public void go() {
    }

    public void sit() {
    }

    public void run() {
    }

    public void howl() {
    }

    public void hunt() {
    }
}