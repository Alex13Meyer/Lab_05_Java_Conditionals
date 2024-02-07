import java.util.Scanner;
class Lab_05_PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Party Affiliation Key: ");
        System.out.println("R  = Republican");
        System.out.println("D = Democrat");
        System.out.println("I = Independent");
        System.out.println("Enter your party affiliation (R-D-I): ");

        String partyAffiliation = in.nextLine().toUpperCase();

        switch (partyAffiliation) {
            case "R":
                System.out.println("You get a Republican Elephant. ");
                break;
            case "D":
                System.out.println("You get a Democratic Donkey. ");
                break;
            case "I":
                System.out.println("You get an Independent Person. ");
                break;
            default:
                System.out.println("You get an Other symbol. ");
                break;
        }

        in.close();
    }
}
