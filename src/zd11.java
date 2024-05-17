import java.util.Scanner;

public class zd11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        double suma_ciagu = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Podaj liczbę: ");
            int liczba = scanner.nextInt();
            suma += liczba;
            suma_ciagu += i / (11 - i);
        }

        System.out.println("Suma wprowadzonych liczb: " + suma);
        System.out.println("Suma ciągu wynosi: " + suma_ciagu);
    }
}
