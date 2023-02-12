import java.util.Scanner;

public class No_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.println("Selamat datang di bootcamp Kawah Edukasi, " + nama + "!");

        short shortVariable1 = 32767;
        short shortVariable2 = -32768;

        double doubleVariable1 = 3.141592653589793238;
        double doubleVariable2 = -0.123456789;

        char charVariable1 = 'A';
        char charVariable2 = 'B';

        boolean booleanVariable1 = true;
        boolean booleanVariable2 = false;

        System.out.println("short1: " + shortVariable1);
        System.out.println("short2: " + shortVariable2);
        System.out.println("double1: " + doubleVariable1);
        System.out.println("double2: " + doubleVariable2);
        System.out.println("char1: " + charVariable1);
        System.out.println("char2: " + charVariable2);
        System.out.println("boolean1: " + booleanVariable1);
        System.out.println("boolean2: " + booleanVariable2);

        String string1 = "Saya senang ";
        String string2 = "belajar ";
        String string3 = "Java Language";

        String hasil = string1 + string2 + string3;
        System.out.println("Hasil: " + hasil);
    }
}
