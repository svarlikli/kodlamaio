package training;

public class arkadasSayilar {
    public static void main(String[] args) {
        // 220-284 kendileri hariç pozitif tam bölenlerinin toplamı
        // diğer sayıya eşit olan sayılara arkadaş sayılar denir

        int sayi1 = 222;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 += i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 += i;
            }
        }
        if (toplam1 == sayi2 && toplam2 == sayi1) {
            System.out.println("arkadaş sayılardır : " + sayi1 + " ve " + sayi2);
        } else {
            System.out.println("arkadaş sayı değiller : " + sayi1 + " ve " + sayi2);
        }
    }
}
