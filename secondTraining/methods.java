package secondTraining;

public class methods {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacakSayi = 0;
        boolean sonuc = true;
        for (int ara : sayilar) {
            if (ara == aranacakSayi) {
                sonuc = true;
                break;
            } else {
                sonuc = false;
            }
        }
        if (sonuc) {
            String mesaj = "sayı bulundu " + aranacakSayi;
            mesajVer(mesaj);
        } else {
            System.out.println("sayi bulunamadı " + aranacakSayi);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
