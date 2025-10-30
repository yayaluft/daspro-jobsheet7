import java.util.Scanner;
public class PenjualanTiket11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket = 50000;
        int jumlahTiket = 0;
        int totalTiket = 0;
        double tarifTiket;
        double totalPenjualan = 0;
        
        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik '0' untuk keluar): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket==0) {
                System.out.println("Program telah selesai.");
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Masukkan kembali jumlah tiket yang valid.");
                continue;
            }
            if (jumlahTiket > 0) {
                if (jumlahTiket > 4 && jumlahTiket <= 10) {
                    System.out.println("Potongan harga 10%!");
                    tarifTiket = jumlahTiket * tiket * 0.9;
                    totalPenjualan += tarifTiket;
                } 
                else if (jumlahTiket > 10) {
                    System.out.println("Potongan harga 15%!");
                    tarifTiket = jumlahTiket * tiket * 0.85;
                    totalPenjualan += tarifTiket;
                } else { 
                    tarifTiket = jumlahTiket * tiket;
                    totalPenjualan += tarifTiket;
                } 
                System.out.println("Total pembayaran tiket Rp."+(int)tarifTiket);
            }
            totalTiket += jumlahTiket;
        }
        System.out.println("Total tiket terjual pada hari ini: " + totalTiket + " tiket");
        System.out.println("Total pendapatan bioskop pada hari ini: Rp." + (int)totalPenjualan);
    }
}


