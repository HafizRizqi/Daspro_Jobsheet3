import java.util.Scanner;

public class Perusahaan12 {
    public static void main(String[] args) {
        Scanner gj = new Scanner (System.in);
        double jmlJamKrj, upahPrJam;
        
        System.out.println("Masukan Jumlah Jam Kerja: ");
        jmlJamKrj = gj.nextDouble();
        System.out.println("Masukan Upah Per Jam: Rp ");
        upahPrJam = gj.nextDouble();

        double gajiKry = jmlJamKrj * upahPrJam;
        double bonus = gajiKry * 0.10;
        double gajiKotor = gajiKry + bonus;
        double pajak = gajiKotor * 0.5;

        double totalGaji = gajiKotor - pajak;
        System.out.println("Total Gaji Karyawan: Rp " + totalGaji);
    }
}