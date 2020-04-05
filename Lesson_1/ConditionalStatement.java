public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if(age > 20) {
            System.out.println("You are already an adult.");
        }

        boolean isMale = true;
        if(isMale) {
            System.out.println("Hello, brother!");
        } 
        if(!isMale) {
            System.out.println("Women! Take care of man.");
        }

        float height = 1.92f;
        if(height < 1.8) {
            System.out.println("You are not tall.");
        } else {
            System.out.println("Your height " + height + " m is above average.");
        }

        char firstNameLetter = 'I';
        if(firstNameLetter == 'M') {
            System.out.println("Please, open the folder C: \\ M on your computer.");
        } else if(firstNameLetter == 'I') {
            System.out.println("Please, open the folder C: \\ I on your computer.");
        } else {
            System.out.println("Your name is missing. Please press any key to continue.");
        }
    }
}