import java.util.Scanner;

public class zd9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char czyKontynuowac;

        do {
            System.out.print("Wprowadź pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Wprowadź drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            double suma = liczba1 + liczba2;
            System.out.println("Suma tych liczb wynosi: " + suma);

            System.out.print("Czy chcesz kontynuować (T/N)? ");
            czyKontynuowac = scanner.next().charAt(0);
        } while (czyKontynuowac == 'T' || czyKontynuowac == 't');

        System.out.println("Koniec programu. Dziękuję!");
    }
}
