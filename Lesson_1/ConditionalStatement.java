public class ConditionalStatement {
    public static void main(String[] args) {
        int howOld = 30;
        boolean isAge = howOld > 20;
        if(isAge == true) {
            System.out.println("You are already an adult.");
        } 
        String muzhik = "male";
        boolean isSex = muzhik == "male";
        if(isSex == true) {
            System.out.println("Hello, brother!");
        }
        String neMuzhik = "noMale";
        boolean isSex1 = neMuzhik == "noMale";
        if(isSex1 == true) {
            System.out.println("Women! Take care of man.");
        }
        double h = 1.92;
        boolean isHeight = h < 1.8;
        if(isHeight == true) {
            System.out.println("You are not tall.");
        } else {
            System.out.println("Your height " + h + " m is above average.");
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