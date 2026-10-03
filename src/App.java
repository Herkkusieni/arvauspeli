import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nimi = "pekka";

        while(true)
        {
            System.out.print("Arvaa nimi: ");
            String arvaus = scanner.nextLine();

            if (arvaus.toLowerCase().equals(nimi)) {
                System.out.println("Onneksi olkoon! Arvasit oikein.");
                break;
            } else {
                System.out.println("Väärin!");
            }
        }

        scanner.close();
    }
}
