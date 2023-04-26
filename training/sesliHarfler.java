package training;

public class sesliHarfler {
    public static void main(String[] args) {
        char harf = 'e';
        boolean sonuc = true;
        char[] sesliHarfler = {'A', 'E', 'I', 'İ', 'O', 'Ö', 'U', 'Ü', 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};

        //döngü ile
/*        for (char sesliHarf : training.sesliHarfler) {
            if (harf == sesliHarf) {
                sonuc = true;
                break;
            } else {
                sonuc = false;
            }
        }
        if (sonuc) {
            System.out.println("sesli harftir");
        } else {
            System.out.println("sesli harf değildir");
        }*/

        //switch case
        switch (harf){
            case 'A':
            case 'E':
            case 'I':
            case 'İ':
            case 'O':
            case 'Ö':
            case 'U':
            case 'Ü':
            case 'a':
            case 'e':
            case 'ı':
            case 'i':
            case 'o':
            case 'ö':
            case 'u':
            case 'ü':
                System.out.println("sesli harf");
                break;
            default:
                System.out.println("sessiz harf");
        }
    }
}
