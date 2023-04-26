package secondTraining;

public class sayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacakSayi = 0;
        boolean sonuc = true;
        for (int ara : sayilar) {
            if (ara == aranacakSayi) {
                sonuc = true;
                break;
            }else {
                sonuc =false;
            }
        }
        if (sonuc) {
            System.out.println("sayı bulundu " + aranacakSayi);
        } else {
            System.out.println("sayi bulunamadı " + aranacakSayi);
        }
    }
}
