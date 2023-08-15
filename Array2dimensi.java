/* 
 * 
 * 
 */
package program;

/**
 *
 * @author PC-1
 */
//Import Class yang dibutuhkan
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Array2dimensi {

    public static void main(String[] args) {
       	// Mata uang Indonesia
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        // Deklarasi Variabel 
        int Pilihan, Uang = 0, Kembalian, jum = 0, i = 0, Inventori = 0;
        double total_bayar = 0;
        // Deklarasi Array
        int[] kode = new int[24];
        int[] qty = new int[24];
        int[] harga = new int[24];
        double [] diskon= new double [24];
        double[] sub_total = new double[24];
        String[] barang = new String[24];
        //  Scanner dan Array List

        Scanner in = new Scanner(System.in);
        List<String> menu = new ArrayList<>();
        
        // atribut untuk menyimpan data-data barang
        
    do{
        menu.add(  "██╗░░██╗███╗░░░███╗" + 
                 "\n██║░██╔╝████╗░████║" + 
                 "\n█████═╝░██╔████╔██║" + 
                 "\n██╔═██╗░██║╚██╔╝██║" + 
                 "\n██║░╚██╗██║░╚═╝░██║\t" + 
                 "\n╚═╝░░╚═╝╚═╝░░░░░╚═╝\n"
                + "    BENGKEL KHASANAH MOTOR\n" +
                  "  Jln. A. H NASUTION No. 23/25\n" +
                  "    KOTA BANDUNG, JAWA BARAT     ");
        
        menu.add("╔════════════════════════╗");
        menu.add("║1. Transaksi                          ║");
        menu.add("║2. Tentang Kami                       ║");
        menu.add("║3. Keluar                             ║");
        menu.add("╚════════════════════════╝");

        System.out.println(menu.get(0));
        System.out.println(menu.get(1));
        System.out.println(menu.get(2));
        System.out.println(menu.get(3));
        System.out.println(menu.get(4));
        System.out.println(menu.get(5));
        
        
                

        System.out.println("\nMasukan Pilihan = ");
        Pilihan = in.nextInt();
        switch (Pilihan) {
            case 1:
                System.out.println("\n\tＳＥＬＡＭＡＴ ＤＡＴＡＮＧ ＤＩ ＫＨＡＳＡＮＡＨ ＭＯＴＯＲ");
                System.out.println("\t════════SELAMAT BERBELANJA════════");
                System.out.println("             °°°°°°°° Produk Kami °°°°°°°°        ");
                System.out.println("╔═══════════════════════════════════════╗");
                System.out.println("║1. Oli Yamalube Super Matic         = Rp.70.000                ║");
                System.out.println("║2. Oli AHM MPX 2                    = Rp.50.000                ║");
                System.out.println("║3. Oli Yamalube Matic               = Rp.50.000                ║");
                System.out.println("║4. Baut                             = Rp.1.000                 ║");
                System.out.println("║5. Rem                              = Rp.25.000                ║");
                System.out.println("║6. Tibel                            = Rp.100.000               ║");
                System.out.println("║7. Lampu Expensive                  = Rp.50.000                ║");
                System.out.println("║8. Ban Motor                        = Rp.100.000               ║");
                System.out.println("║9. Aki Motor                        = Rp.150.000               ║");
                System.out.println("║10. Sok Breker belakang             = Rp.212.000               ║");
                System.out.println("║11. V- Belt                         = Rp.133.000               ║");
                System.out.println("║12. Gear Set Blade                  = Rp.90.000                ║");
                System.out.println("║13. Velk Motor                      = Rp.300.000               ║");
                System.out.println("║14. Busi BP 7                       = Rp.60.000                ║");
                System.out.println("║15. Gear Kharisma                   = Rp.90.000                ║");
                System.out.println("║16. Karburator SupraX125            = Rp.255.000               ║");
                System.out.println("║17. Gear Set F1                     = Rp.169.000               ║");
                System.out.println("║18. Kabel aki Yamaha                = Rp.85.000                ║");
                System.out.println("║19. Kabel aki beat FI               = Rp.75.000                ║");
                System.out.println("║20. Kampas Ganda Yamaha             = Rp.400.000               ║");
                System.out.println("║21. Kabel tali gas set F1 zr force  = Rp.77.000                ║");
                System.out.println("║22. Set blok seher yamaha M3        = Rp.485.000               ║");
                System.out.println("║23. Spion Honda Beat Karbu          = Rp.49.000                ║");
                System.out.println("║24. Oli AHM SPX 2                   = Rp.65.000                ║");
                System.out.println("╚═══════════════════════════════════════╝");
                
                
                System.out.print("\nMasukan Jumlah Produk yang ingin anda beli : ");
                jum = in.nextInt();
                System.out.println(" ");
                //Memasukan elemen didalam array
                for (i = 0; i < jum; i++) {
                    System.out.print("Masukan Kode Barang Ke-" + (i + 1) + " : ");
                    kode[i] = in.nextInt();
                    System.out.print("Masukan qty Ke-" + (i + 1) + " : ");
                    qty[i] = in.nextInt();
                    switch (kode[i]) {
                        case 1:                           
                            barang[i] = "Oli Yamalube Super Matic ";
                            harga[i] = 70000;
                            diskon[i]=0;
                            break;
                        case 2:
                            barang[i] = "Oli AHM MPX 2 ";
                            harga[i] = 50000;
                            diskon[i]=0;
                            break;
                        case 3:
                            barang[i] = "Oli Yamalube matic  ";
                            harga[i] = 50000;
                            diskon[i]=0;
                            break;
                        case 4:
                            barang[i] = "Baut  ";
                            harga[i] = 1000;
                            diskon[i]=0;
                            break;
                        case 5:
                            barang[i] = "Rem  ";
                            harga[i] = 25000;
                            diskon[i]=0;
                            break;
                        case 6:
                            barang[i] = "Tibel ";
                            harga[i] = 100000;
                            diskon[i]=0;
                            break;
                        case 7:
                            barang[i] = "Lampu Expensive ";
                            harga[i] = 50000;
                            diskon[i]=0;
                            break;
                        case 8:
                            barang[i] = "Ban Motor ";
                            harga[i] = 100000;
                            diskon[i]=0;
                            break;
                        case 9:
                            barang[i] = "Aki Motor ";
                            harga[i] = 150000;
                            diskon[i]=0;
                            break;
                        case 10:
                            barang[i] = "Sok Breker belakang ";
                            harga[i] = 212000;
                            diskon[i]=0;
                            break;
                        case 11:
                            barang[i] = "V- Belt  ";
                            harga[i] = 133000;
                            diskon[i]=0;
                            break;
                        case 12:
                            barang[i] = "Gear Set Blade  ";
                            harga[i] = 90000;
                            diskon[i]=0;
                            break;
                        case 13:
                            barang[i] = "Velk Motor  ";
                            harga[i] = 300000;
                            break;
                        case 14:
                            barang[i] = "Busi BP 7 ";
                            harga[i] = 60000;
                            diskon[i]=0;
                            break;
                        case 15:
                            barang[i] = "Gear Karisma ";
                            harga[i] = 90000;
                            diskon[i]=0;
                            break;
                        case 16:
                            barang[i] = "Karburator SupraX125 ";
                            harga[i] = 255000;
                            diskon[i]=0;
                            break;
                        case 17:
                            barang[i] = "Gear Set F1 ";
                            harga[i] = 75000;
                            diskon[i]=0;
                            break;
                        case 18:
                            barang[i] = "Kabel aki Yamaha ";
                            harga[i] = 85000;
                            diskon[i]=0;
                            break;
                        case 19:
                            barang[i] = "Kabel aki beat FI ";
                            harga[i] = 75000;
                            diskon[i]=0;
                            break;
                        case 20:
                            barang[i] = "Kampas Ganda Yamaha ";
                            harga[i] = 400000;
                            diskon[i]=0;
                            break;
                        case 21:
                            barang[i] = "Kabel tali gas set F1 zr force ";
                            harga[i] = 77000;
                            diskon[i]=0;
                            break;
                        case 22:
                            barang[i] = "Set blok seher yamaha M3 ";
                            harga[i] = 485000;
                            diskon[i]=0;
                        case 23:
                            barang[i] = "Spion Honda Beat Karbu ";
                            harga[i] = 49000;
                            diskon[i]=0;
                        case 24:
                            barang[i] = "Oli AHM SPX 2 ";
                            harga[i] = 65000;
                            diskon[i]=0;
                        default:
                            System.out.println("Kode Barang Tidak Tersedia");

                    }
                }
                //Pengaturan Format Number
                formatRp.setCurrencySymbol("Rp. ");
                formatRp.setMonetaryDecimalSeparator(',');
                formatRp.setGroupingSeparator('.');
                kursIndonesia.setDecimalFormatSymbols(formatRp);

                System.out.println(" ");
                System.out.println  ("╔═══╤═══════════════════════════╤════════════╤══════╤════════╤════════════╗" +
                                     "\n║ No│   	  Nama Barang                    │   Harga            │    Qty   │  Disc       │ Sub Total         ║" +
                                     "\n╚═══╧═══════════════════════════╧═══════════╧══════╧════════╧════════════╝");
                //Menampilkan seluruh elemen di dalam array
                for (i=0; i<jum;i++){ 
             sub_total[i]=((qty[i]*harga[i])-(qty[i]*harga[i]*diskon[i]));
             total_bayar+=sub_total[i];
              System.out.println(i+ 1+"      "+barang[i]+"     "+kursIndonesia.format(harga[i])+"      "+qty[i]+"       "+(int)(diskon[i]*100)+"%"+"       "+kursIndonesia.format(sub_total[i])); 
          }
          System.out.println(" ");
          //Menampilkan total bayar
          System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));
                System.out.println(" Masukan Uang anda : ");
                Uang = in.nextInt();
                Kembalian = (int) (Uang-total_bayar );
            System.out.println("Kembalian anda : "+kursIndonesia.format(Kembalian));      
          System.out.println(" T E R I M A K A S I H");
                System.out.println("                                                                                                        IRWAN GUNAWAN");    
          break;

            case 2:
                System.out.println("░█████╗░██████╗░░█████╗░██╗░░░██╗████████╗  ██╗░░░██╗░██████╗\n" +
                                   "██╔══██╗██╔══██╗██╔══██╗██║░░░██║╚══██╔══╝  ██║░░░██║██╔════╝\n" +
                                   "███████║██████╦╝██║░░██║██║░░░██║░░░██║░░░  ██║░░░██║╚█████╗░\n" +
                                   "██╔══██║██╔══██╗██║░░██║██║░░░██║░░░██║░░░  ██║░░░██║░╚═══██╗\n" +
                                   "██║░░██║██████╦╝╚█████╔╝╚██████╔╝░░░██║░░░  ╚██████╔╝██████╔╝\n" +
                                    "╚═╝░░╚═╝╚═════╝░░╚════╝░░╚═════╝░░░░╚═╝░░░  ░╚═════╝░╚═════╝░");
                 System.out.println("WORKAM ADALAH SEBUAH PROGRAM APLIKASI TRANSAKSI DAN INVENTAIS SEBUAH BENGKEL. APLIKASI INI DIBUAT"
                        + "BERDASARKAN KONDISI KHASANAH MOTOR YANG TERBILANG MASIH CONVERSIONAL.");
                System.out.println("MANFAAT\n"
                        + "DENGAN ADANYA APLIKASI INI BENGKEL KHASANAH MOTOR LEBIH MUDAH DALAM MELAKUKAN TRANSAKSI DAN INVENTARIS BARANG") ;
                System.out.println("BATASAN\n"
                        + "SISTEM YANG AKAN DIBANGUN MEMILIKI BEBEAPA BATASAN:\n"
                        + "1.   APLIKASI INI HANYA MELIPUTI TRANSAKSI DAN INVENTARIS.\n"
                        + "2.   APLIKASI INI HANYA MENANGANI PERHITUNGAN KEUANGAN TANPA MENANGANI SISTEM KEUANGAN.\n"
                        + "3.   PEMBAYARAN DILAKUKANSECARA LANGSUNG DI BENGKEL TEMPAT SERVIS DAN MENGGUNAKAN STRUK.\n"
                        + "4.   PROGRAM INI MASIH MENGGUNAKAN ARRAY UNTUK BASIS DATANYA.\n"
                        + "5.   PENGGUNA HANYA BISA MENGGUNAKAN ATAU MENJALANKAN APLIKASI INI MELALUI JAVA N-IDE");
                break;
                case 3:
              System.out.println("▀▀█▀▀ ░█▀▀▀ ░█▀▀█ ▀█▀ ░█▀▄▀█ ─█▀▀█ ░█─▄▀ ─█▀▀█ ░█▀▀▀█ ▀█▀ ░█─░█ \n" +
                                 "─░█── ░█▀▀▀ ░█▄▄▀ ░█─ ░█░█░█ ░█▄▄█ ░█▀▄─ ░█▄▄█ ─▀▀▀▄▄ ░█─ ░█▀▀█ \n" +
                                 "─░█── ░█▄▄▄ ░█─░█ ▄█▄ ░█──░█ ░█─░█ ░█─░█ ░█─░█ ░█▄▄▄█ ▄█▄ ░█─░█\n" +
                                 "\n" +
                                 "\n" +
                                 "▀▀█▀▀ ░█▀▀▀ ░█─── ─█▀▀█ ░█─░█ 　 ░█▀▄▀█ ░█▀▀▀ ░█▄─░█ ░█▀▀█ ░█▀▀█ ░█─░█ ░█▄─░█ ─█▀▀█ ░█─▄▀ ─█▀▀█ ░█▄─░█ \n" +
                                 "─░█── ░█▀▀▀ ░█─── ░█▄▄█ ░█▀▀█ 　 ░█░█░█ ░█▀▀▀ ░█░█░█ ░█─▄▄ ░█─▄▄ ░█─░█ ░█░█░█ ░█▄▄█ ░█▀▄─ ░█▄▄█ ░█░█░█ \n" +
                                 "─░█── ░█▄▄▄ ░█▄▄█ ░█─░█ ░█─░█ 　 ░█──░█ ░█▄▄▄ ░█──▀█ ░█▄▄█ ░█▄▄█ ─▀▄▄▀ ░█──▀█ ░█─░█ ░█─░█ ░█─░█ ░█──▀█\n" +
                                 "\n" +
                                 "\n" +
                                 "─█▀▀█ ░█▀▀█ ░█─── ▀█▀ ░█─▄▀ ─█▀▀█ ░█▀▀▀█ ▀█▀ 　 ░█─▄▀ ─█▀▀█ ░█▀▄▀█ ▀█▀ \n" +
                                 "░█▄▄█ ░█▄▄█ ░█─── ░█─ ░█▀▄─ ░█▄▄█ ─▀▀▀▄▄ ░█─ 　 ░█▀▄─ ░█▄▄█ ░█░█░█ ░█─ \n" +
                                 "░█─░█ ░█─── ░█▄▄█ ▄█▄ ░█─░█ ░█─░█ ░█▄▄▄█ ▄█▄ 　 ░█─░█ ░█─░█ ░█──░█ ▄█▄");
    }System.out.println("Apakah anda ingin memesan yang lain ?\n1. Ya  \n2. Gak dulu deh");
         System.out.print("Jawaban anda : ");       
       Pilihan = in.nextInt();
    }while( Pilihan ==1);
}
}
