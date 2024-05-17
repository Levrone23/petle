import java.util.Scanner;
public class zd2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char input;

            do {
                System.out.print("Wpisz 'T', 't', 'N' lub 'n': ");
                input = scanner.next().charAt(0);
            } while (input != 'T' && input != 't' && input != 'N' && input != 'n');

            System.out.println("Poprawne dane wejsciowe: " + input);
        }

    }

