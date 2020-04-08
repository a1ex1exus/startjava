public class Cycle {
    public static void main(String[] args) {

        // TODO: Print to the console using the "for loop" all numbers from 0 to 20

        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
                System.out.println("\n");

        // TODO: Print to the console using the "while loop" all numbers from 6 to -6 with step 2

        int counter = 6;
        while(counter >= -6) {
            System.out.println(counter);
            counter -= 2;
        }
                System.out.println("\n");

        // TODO: Use the "do while loop" to calculate the sum of odd numbers
        //      from 10 to 20 and output it to the console

        int i = 10; 
        int sum = 0;
        do {
            if(i % 2 != 0) {
            System.out.println(i);
            sum += i;
                }
            i++;
            } while(i <= 20);
                System.out.println();
                System.out.println("Sum of all odd numbers: " + sum);
    }
}
