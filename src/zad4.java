import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę przepracowanych dni: ");
        int liczbaDni = scanner.nextInt();

        if (liczbaDni < 1) {
            System.out.println("Liczba dni musi być większa lub równa 1.");
            return;
        }

        int zarobek = 1; // Pierwszego dnia pracownik zarabia grosz
        int sumaZarobku = zarobek;

        System.out.println("Dzień\tZarobek");
        System.out.println("-----------------");

        for (int dzien = 1; dzien <= liczbaDni; dzien++) {
            System.out.println(dzien + "\t" + formatujKwote(zarobek));
            zarobek *= 2; // Uzyskuje dwukrotność zapłaty za poprzedni dzień
            sumaZarobku += zarobek;
        }

        System.out.println("-----------------");
        System.out.println("Sumaryczna zapłata: " + formatujKwote(sumaZarobku));
    }

    private static String formatujKwote(int kwota) {
        return kwota / 100.0 + " zł";
    }
}