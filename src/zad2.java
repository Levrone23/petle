import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj szybkość pojazdu (w km/h): ");
        int szybkosc = scanner.nextInt();

        if (szybkosc < 0) {
            System.out.println("Szybkość nie może być ujemna.");
            return;
        }

        System.out.print("Podaj liczbę godzin podróży: ");
        int liczbaGodzin = scanner.nextInt();

        if (liczbaGodzin < 1) {
            System.out.println("Liczba godzin musi być większa lub równa 1.");
            return;
        }

        System.out.println("Godzina\tPrzebyta odległość");
        System.out.println("-----------------------------");
        for (int godzina = 1; godzina <= liczbaGodzin; godzina++) {
            int odleglosc = szybkosc * godzina;
            System.out.println(godzina + "\t" + odleglosc);
        }
    }
}