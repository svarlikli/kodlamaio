package training;

public class miniProjeAsalSayi {
    public static void main(String[] args) {
        int number = 2;
        boolean isPrime = true;
        if (number < 2) {
            System.out.println("geçersiz girdi");
            return;
        }
        if (number == 2) {
            System.out.println("sayı asaldır");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("sayı asaldır :" + number);
        } else {
            System.out.println("sayı asal değildir ");
        }
//        System.out.println(asalMi(number));
    }

    public static boolean asalMi(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
