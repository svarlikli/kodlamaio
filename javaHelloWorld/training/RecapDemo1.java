package training;

public class RecapDemo1 {
    public static void main(String[] args) {
        //En büyük sayıyı bulma
        int sayi2 = 30, sayi3 = 35;
        int enbuyuk = 20;
        if (enbuyuk < sayi3) {
            enbuyuk = sayi3;
        }
        if (enbuyuk < sayi2) {
            enbuyuk = sayi2;
        }
        System.out.println(enbuyuk);
    }
}
