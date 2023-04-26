package training;

public class mukemmelSayi {
    public static void main(String[] args) {
        //kendinden başka pozitif tüm tam bölenlerin sayıların toplamı
        // kendine eşit olan sayıya mükemmel sayı denir.

        int sayi = 22;
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam +=i;
            }
        }
        if (toplam == sayi) {
            System.out.println("sayı mükemmeldir : " + sayi);
        } else {
            System.out.println("sayı mükemmel değildir" + sayi);
        }
    }
}
