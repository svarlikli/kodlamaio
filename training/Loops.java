package training;

public class Loops {
    public static void main(String[] args) {
        //for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("for bitti");
        //while
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while bitti");

        //do-while
        int j = 1;
        do {
            System.out.println("şart sağlanmasada çalışır Example : loglandı");
            System.out.println(j);
            j += 2;
        }
        while (j < 10);
        System.out.println("do while bitti");
    }
}
