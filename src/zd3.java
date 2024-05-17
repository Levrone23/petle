
    import java.util.Scanner;

    public class zd3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String odpowiedz;

            do {
                System.out.print("Wpisz 'Tak' lub 'Nie': ");
                odpowiedz = scanner.nextLine();
            } while (!odpowiedz.equalsIgnoreCase("Tak") && !odpowiedz.equalsIgnoreCase("Nie"));

            System.out.println("Dziękuję za odpowiedź!");
        }
    }

