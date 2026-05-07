import java.util.Scanner;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int uebertretung;

        System.out.print("Geschwindigkeitsüberschreitung in km/h eingeben: ");
        uebertretung = scanner.nextInt();

        if (uebertretung <= 10) {

            System.out.println("Keine Strafe");

        } else if (uebertretung <= 30) {

            System.out.println("Strafe: 50 Euro");

        } else if (uebertretung <= 45) {

            System.out.println("Strafe: 100 Euro");

        } else if (uebertretung <= 60) {

            System.out.println("Strafe: 150 Euro");

        } else {

            System.out.println("Strafe: 200 Euro");

        }

        scanner.close();
    }