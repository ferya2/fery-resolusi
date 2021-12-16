/*
 * Nama   : Ade Fery Angriawan
 * Kelas  : TIFRP21C
 * NPM    : xxxxxxxxxx
 */
package pombensin;


import java.util.Scanner;

public class pombensin {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int pilihan, jumlahbarang, jumlahbarang1 = 0, jumlahbarang2, harga;
        
        
        System.out.println("==========Pom Bensin==========");
        System.out.println("1. Pertalite           = Rp. 7500/Liter");
        System.out.println("2. Pertamax            = Rp. 9000/Liter");
        System.out.println("3. Pertamax Turbo      = Rp. 9500/Liter");
        System.out.println("========================================");
        System.out.print("  Masukkan Pilihan Bensin Dengan Angka = ");
        pilihan = in.nextInt();
        System.out.println("========================================");
        switch (pilihan){
        case 1:System.out.println(" Anda akan membeli pertalite");
                System.out.print("Masukkan Jumlah Liter Pertalite = ");
                    jumlahbarang = in.nextInt();
                    System.out.println("========================================");
                    harga = 7500*jumlahbarang;
                    System.out.println("Harga pertalite = Rp. "+harga);
                    break;
        case 2: System.out.println(" Anda akan membeli Pertamax");
                System.out.print("Masukkan Jumlah Liter Pertamax = ");
                    jumlahbarang = in.nextInt();
                    System.out.println("========================================");
                    harga = 9000*jumlahbarang;
                    System.out.println("Harga Pertamax = Rp. "+harga);
                    break; 
                    
        case 3: System.out.println(" Anda akan membeli PertamaxTurbo");
                    System.out.print("Masukkan Jumlah Liter PertamaxTurbo = ");
                    jumlahbarang = in.nextInt();
                    System.out.println("========================================");
                    harga = 9500*jumlahbarang;
                    System.out.println("Harga PertamaxTurbo = Rp. "+harga);
    }      
}
        
}
    
