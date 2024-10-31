import java.util.Scanner;

public class Main {

    // Rekürsif metot
    static int power(int base, int exponent) {
        // Üs 0 olduğunda sonuç 1
        if (exponent == 0) {
            return 1;
        }
        // Negatif üsler için üssü pozitif yap ve 1 / (taban^üslü) işlemi
        else if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        // Rekürsif olarak taban ile üssü bir azaltarak hesaplama
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponent;

        while (true) {
            System.out.print("Taban değeri giriniz (çıkmak için -1 girin): ");
            base = scanner.nextInt();
            if (base == -1) {
                break; // Kullanıcı -1 girerse döngüden çık
            }
            System.out.print("Üs değerini giriniz: ");
            exponent = scanner.nextInt();

            int result = power(base, exponent);
            System.out.println("Sonuç : " + result);
        }

        scanner.close();
    }
}
