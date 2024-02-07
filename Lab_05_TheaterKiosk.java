import java.util.Scanner;
public class Lab_05_TheaterKiosk {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("What is your age? ");
        int age = in.nextInt();
        if (age >= 21) {
            System.out.println("Hooray! You get a wristband. ");
        }
        else { System.out.println("You must be 21 or older to receive a wristband. ");}

        in.close();

    }
}