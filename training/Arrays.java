package training;

public class Arrays {

    public static void main(String[] args) {
        String student1 = "Suat";
        String student2 = "Suat1";
        String student3 = "Suat2";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("***********************");
        String[] students = new String[3];
        students[0] = "Suat";
        students[1] = "Suat1";
        students[2] = "Suat2";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("***********************");

        for (String student:students) {
            System.out.println(student);
        }
    }
}
