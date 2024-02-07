import java.util.Scanner;
public class Lab_05_BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your birth month (1 - 12): ");

        int birthMonth = in.nextInt();

        if (birthMonth >= 1 & birthMonth <= 12)
        {System.out.println("Your birth month is: " + birthMonth);}
        else {
            System.out.println("Invalid birth month: " + birthMonth);
        };

       in.close();




    }
}