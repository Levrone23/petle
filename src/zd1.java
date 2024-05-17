import java.util.Scanner;
public class zd1 {
    public static void main(String[] args){
        Scanner klawisz = new Scanner(System.in);
        int licznik;
        System.out.print("Podaj liczbe z przedziału od 10 do 24: ");
        licznik = klawisz.nextInt();
        while(licznik >= 10 && licznik <=24){
            System.out.println("liczba zawiera się w przedziale");
            licznik++;
        }
        System.out.println("Liczba nie należy do przedziału");
    }
}


