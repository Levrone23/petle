import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dodatnią niezerową liczbę całkowitą: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podana liczba musi być dodatnia i niezerowa.");
        } else {
            int suma = 0;
            for (int i = 1; i <= n; i++) {
                suma += i;
            }
            System.out.println("Suma liczb od 1 do " + n + " wynosi: " + suma);
        }
    }
}
