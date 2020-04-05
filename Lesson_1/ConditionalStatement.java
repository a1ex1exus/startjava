public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if(age > 20) {
            System.out.println("You are already an adult.");
        }

        String he = "male";
        boolean isMail = true;
        if(isMail) {
            System.out.println("Hello, brother!");
        }

        String she = "noMale";
        boolean isNoMale = true;
        if(isNoMale) {
            System.out.println("Women! Take care of man.");
        }

        float height = 1.92f;
        if(height < 1.8) {
            System.out.println("You are not tall.");
        } else {
            System.out.println("Your height " + height + " m is above average.");
        }

        char firstLetter = 'I';
        if(firstLetter == 'M') {
            System.out.println("Please, open the folder C: \\ M on your computer.");
        } else if(firstLetter == 'I') {
            System.out.println("Please, open the folder C: \\ I on your computer.");
        } else {
            System.out.println("Your name is missing. Please press any key to continue.");
        }
    }
}