public class zd15  {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Nowa linia po każdym wierszu
        }
    }
}