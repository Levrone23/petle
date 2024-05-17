public class zd12 {
    public static void main(String[] args) {
        double suma = 0;

        for (int i = 1; i <= 30; i++) {
            suma += i / (31.0 - i);
        }

        System.out.println("Suma ciągu wynosi: " + suma);
    }
}