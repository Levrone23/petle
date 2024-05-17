import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj czas (w sekundach): ");
        double czas = scanner.nextDouble();

        // Oblicz odległość
        double predkosc = 343; // Prędkość dźwięku w m/s
        double odleglosc = predkosc * czas;

        // Zapisz dane do pliku
        try {
            FileWriter fileWriter = new FileWriter("odleglosc.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Czas (s): " + czas);
            printWriter.println("Odległość (m): " + odleglosc);
            printWriter.close();
            System.out.println("Dane zapisane w pliku odleglosc.txt.");
        } catch (IOException e) {
            System.err.println("Błąd zapisu do pliku.");
        }
    }
}
