/* 
 * 
 * 
 */
package program;


import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class Inventori {

    
    public static void main(String[] args)throws Exception {//menjalankan fungsivoid menu();
          menu();
    }
    public static void Tampilkan(){
        System.out.println("██╗░░██╗███╗░░░███╗\n" +
                           "██║░██╔╝████╗░████║\n" +
                           "█████═╝░██╔████╔██║\n" +
                           "██╔═██╗░██║╚██╔╝██║\n" +
                           "██║░╚██╗██║░╚═╝░██║\n" +
                           "╚═╝░░╚═╝╚═╝░░░░░╚═╝"
                            + "BENGKEL KHASANAH MOTOR\n" +
                            "Jln. \n" +
                              "KOTA ");
        
        System.out.println("------List Inventori------");
        System.out.println("1.Lihat List Inventory");
        System.out.println("2.Mengupdate Kuantitas Barang");
        System.out.println("3.Keluar");
        System.out.println("Silakan masukkan nomor urut operasi yang akan dilakukan: ");
    }
    public static void menu()throws IOException{
        ArrayList<String> brand =new ArrayList<String>();
        ArrayList<Integer> num  =new ArrayList<Integer>();
        ArrayList<Double> sizee =new ArrayList<Double>();
        ArrayList<Double> price =new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        
        // Menambahkan Nama Barang
        brand.add("Oli Yamalube Super Matic");
        brand.add("Oli AHM MPX 2");
        brand.add("Oli Yamalube Matic");
        brand.add("Baut ");
        brand.add("Rem  ");
        brand.add("Tibel");
        brand.add("Lampu exspensive");
        brand.add("Ban Motor");
        brand.add("Aki Motor");
        brand.add("Sok breker belakang");
        brand.add("V- Belt");        
        brand.add("Gear set Blade");
        brand.add("Velk Motor");
        brand.add("Busi BP7");   
        brand.add("Gear Karisma");
        brand.add("Karburator supraX125");
        brand.add("Gear set F1");
        brand.add("Kabel aki yamaha");
        brand.add("kabel aki beat FI");
        brand.add("Kampas ganda yamaha");
        brand.add("Kabel tali gas zF1zrForce");
        brand.add("Set blok seher yamaha M3");
        brand.add("Spion honda beat karbu");
        brand.add("Oli AHM SPX 2");
        
        // Menambahkan Ukuran barang
        sizee.add(500.);
        sizee.add(300.);
        sizee.add(300.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(60.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(0.);
        sizee.add(500.);
        
        
        // Harga Barang
        price.add(70.000);
        price.add(50.000);
        price.add(50.000);
        price.add(1.000);
        price.add(25.000);
        price.add(100.000);
        price.add(50.000);
        price.add(100.000);
        price.add(150.000);
        price.add(212.000);
        price.add(133.000);
        price.add(90.000);
        price.add(300.000);
        price.add(60.000);
        price.add(90.000);
        price.add(255.000);
        price.add(169.000);
        price.add(85.000);
        price.add(75.000);
        price.add(400.000);
        price.add(77.000);
        price.add(485.000);
        price.add(49.000);
        price.add(65.000);
        
        //Stock Jumlah barang
        num.add(12);
        num.add(15);
        num.add(14);
        num.add(150);
        num.add(15);
        num.add(6);
        num.add(11);
        num.add(22);
        num.add(11);
        num.add(10);
        num.add(6);
        num.add(9);
        num.add(4);
        num.add(20);
        num.add(7);
        num.add(5);
        num.add(8);
        num.add(16);
        num.add(14);
        num.add(3);
        num.add(6);
        num.add(4);
        num.add(8);
        num.add(11);
        
        while(true){
        Tampilkan();//Maka jalankan fungsi Void Tampilkan();
        int Pilih = sc.nextInt();
        switch(Pilih){
            case 1:
                Lihat(brand,sizee,price,num);
                break;
            case 2:
                Ganti(brand,num);
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
                return;
                
            default:
                System.out.println("Inputan Anda salah, silakan input kembali!");
        }
        }
    }
    public static void Lihat(ArrayList<String> brand,ArrayList<Double> sizee,ArrayList<Double> price,
        ArrayList<Integer> num)throws IOException{
            System.out.println("----------List Store Inventori----------");
            System.out.println("Brand and model     \t size         \t Price        \t Inventory");
            for (int i=0;i<brand.size() ;i++ ){
                System.out.println(brand.get(i)+"\t"+sizee.get(i)+"\t"+price.get(i)+"\t"+num.get(i));
            }
            System.out.println("--------------------------------");
            int sum = 0;
            for (int i = 0;i<brand.size() ;i++ ){
                sum+=num.get(i);
            }
            System.out.println("Total inventori:"+sum);
            double sum2 = 0;
            for (int i = 0;i<brand.size() ;i++ ){
                sum2+=num.get(i)*price.get(i);
            }
            System.out.println("Jumlah total barang dalam stok:"+sum2);
            System.out.println("Enter enter untuk kembali ke menu utama");         
            if(new InputStreamReader(System.in).read() == 13){
                return;
            }
        }
        public static void Ganti(ArrayList<String> brand,ArrayList<Integer> num){    
                Scanner sc2 = new Scanner(System.in);
                while(true){
                System.out.println("-------------inventori statement-------------");
                System.out.println("Serial number\t Brand and model\t Inventory");
                for (int i=0;i<brand.size() ;i++ ){
                    System.out.println(i+1+"\t"+brand.get(i)+"\t"+num.get(i));
                }
                System.out.println("--------------------------------");
                System.out.println("Silahkan masukan serial number barang yang akan diubah sesuai tabel diatas dan tekan 0 untuk kembali ke interface utama:");    
                int s = sc2.nextInt();
                int num1=0;
                    if ((s-1)<brand.size()&&s>0){
                        System.out.println("Silakan masukkan jumlah memori yang akan di Update :");
                        num1=sc2.nextInt();
                        num.set(s-1,num1);
                        System.out.println("Update berhasil! Hasilnya adalah sebagai berikut");
                        System.out.println("-------------inventori statement-------------");
                        System.out.println("Serial number\t Brand and model\t Inventory");
                        for (int i=0;i<brand.size() ;i++ ){
                        System.out.println(i+1+"\t"+brand.get(i)+"\t"+num.get(i));
                          }
                        System.out.println("--------------------------------");
                        while(true){
                            System.out.println("Lanjutkan untuk Mengupdate : tekan 1 untuk melanjutkan, Tekan 0 untuk kembali ke menu utama");
                            int b = sc2.nextInt();                            
                            if (b==1){
                                break;
                            }else if(b==0){
                                return;
                            }else{
                                System.out.println("Inputan Anda salah, silakan input kembali!");    
                            }
                        }
                    }else if(s==0){
                        return;
                    }else{
                        System.out.println("Inputan Anda salah, silakan input kembali!");        
                    }
                }        
        }
}
       

        
   
    
    

  
