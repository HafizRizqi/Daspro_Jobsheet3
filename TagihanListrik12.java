import java.util.Scanner;

public class TagihanListrik12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tarifPerKwh = 1500;
        int batasKwh = 500;

        System.out.print("Masukan Jumlah Lstrik Kwh");
        int penggunaanCekKwh = input.nextInt();
        boolean melebihiBts = penggunaanCekKwh > batasKwh;
        int totalTgh = (penggunaanCekKwh * tarifPerKwh);

        System.out.println("Total Tagihan Listrik: Rp " + totalTgh);
        System.out.println("Melebihi batas Penggunaan: " + melebihiBts);


    }
}