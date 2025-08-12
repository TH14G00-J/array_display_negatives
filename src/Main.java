import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        if (n > 10) {
            n = 10;
        }

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int j : vect) {
            if (j < 0) {
                System.out.println(j);
            }
        }
        sc.close();
    }
}