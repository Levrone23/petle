import java.util.Scanner;

public class zd8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double product = 1.0;  // Inicjalizacja zmiennej product

        while (product < 100.0) {
            try {
                System.out.print("Wprowadź liczbę: ");
                double liczba = scanner.nextDouble();  // Pobranie liczby od użytkownika
                product *= 10.0;  // Pomnożenie product przez 10
                product *= liczba;  // Pomnożenie product przez wprowadzoną liczbę
            } catch (java.util.InputMismatchException e) {
                System.out.println("To nie jest poprawna liczba. Spróbuj ponownie.");
                scanner.nextLine();  // Wyczyszczenie bufora wejścia
            }
        }

        System.out.println("Wynik: " + product);
    }
}