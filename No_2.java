 import java.util.Scanner;

public class No_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Volume Balok");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double r = input.nextDouble();
                double luas = 3.14 * r * r;
                System.out.println("Luas lingkaran adalah: " + luas);
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebar = input.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggi = input.nextDouble();
                double volume = panjang * lebar * tinggi;
                System.out.println("Volume balok adalah: " + volume);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
