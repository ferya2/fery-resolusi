/*
 * Nama      : Ade Fery Angriawan
 * Kelas     : TIFRP21C
 * NPM       : xxxxxxxxxxx
 */
package TugasAlgo8;


import java.util.Scanner;
public class Tugas08 {

   
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int pilihan, jumlahbarang, harga,Toping,lagi;
        
        do{
        System.out.println ("=======SELAMAT DATANG DI SUKA SUKA CAFFE======");
        System.out.println ("||==========OBAT GALAU CAFFELATTE===========||");
        System.out.println ("||1. CaffeLatte Small           = Rp. 10.000||");
        System.out.println ("||2. CaffeLatte Medium          = Rp. 15.000||");
        System.out.println ("||3. CaffeLatte Large           = Rp. 20.000||");
        System.out.println ("||<3<3<3<3SAMA DIA YANG BERBUNGA<3<3<3<3<3<3||");
        System.out.println ("||4. Vanilla  Small             = Rp. 10.000||");
        System.out.println ("||5. Vanilla  Medium            = Rp. 15.000||");
        System.out.println ("||6. Vanilla  Large             = Rp. 20.000||");
        System.out.println ("|| <<<<<<< Makin asik bersama Teman >>>>>>> ||");
        System.out.println ("||7. Machiato Small             = Rp. 10.000||");
        System.out.println ("||8. Machiato Medium            = Rp. 15.000||");
        System.out.println ("||9. Maciato  Large             = Rp. 20.000||");
        System.out.println ("|| <<<<<<<<<< Paket Nongki Asik >>>>>>>>>>> ||");
        System.out.println ("||10. Original Blend Small      = Rp. 11.000||");
        System.out.println ("||11. Original Blend Medium     = Rp. 16.000||");
        System.out.println ("||12. Original Blend Large      = RP. 22.000||");
        System.out.println ("=======================================");
        System.out.println ("|| =====Masukkan Pilihan Topping===== ||");
        System.out.println ("||1. Chocochips =  Rp.5000||");
        System.out.println ("||2. Susu Bubuk =  Rp.2000||");
        System.out.print(" Masukkan Pilihan Minum Dengan Angka = ");
        pilihan = in.nextInt();        
        System.out.println("====================================");        
        switch (pilihan){
        case 1:System.out.println(" Anda akan membeli Caffelatte Small");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 10000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println("Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 10000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus membayar sejumlah = Rp."+harga);                        
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 10000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus membayar sejumlah = Rp."+harga);                      
                    }
                    else if( Toping == 0){
                        System.out.println(" Anda akan membeli Caffelatte Small tanpa Toping");
                        harga = 10000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus membayar sejumlah = Rp."+harga);                        
                    }                    
                    break;
        case 2:System.out.println(" Anda akan membeli Caffelatte Medium");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 15000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 15000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus membayar sejumlah = Rp."+harga);                      
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 15000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus membayar sejumlah = Rp."+harga);                      
                    }
                    else if( Toping == 0){
                        System.out.println(" Anda akan membeli Caffelatte Medium tanpa Toping");
                        harga = 15000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus membayar sejumlah = Rp."+harga);                      
                    }                    
                    break;
        case 3:System.out.println(" Anda akan membeli Caffelatte Large");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 20000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 20000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                       
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 20000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                         
                    }
                    else if( Toping == 0){
                        System.out.println(" Anda akan membeli Caffelatte Large tanpa Toping");
                        harga = 20000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus ayar sejumlah = Rp."+harga);                    
                    }                    
                    break;
        case 4:System.out.println(" Anda akan membeli Vanilla Small");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 10000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 10000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                       
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 10000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                         
                    }
                    else if( Toping == 0){
                        System.out.println(" Anda akan membeli Vanilla Small tanpa Toping");
                        harga = 10000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                       
                    }                    
                    break;
        case 5:System.out.println(" Anda akan membeli Vanilla Medium");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 15000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 15000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                       
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 15000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                       
                    }
                    else if( Toping == 0){
                        System.out.println(" Anda akan membeli Vanilla Medium tanpa Toping");
                        harga = 15000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                     
                    }                    
                    break;
        case 6:System.out.println(" Anda akan membeli Vanilla Large");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 20000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 20000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 20000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }
                    else if( Toping == 0){
                        System.out.println(" Anda akan membeli Vanilla Large tanpa Toping");
                        harga = 20000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }                    
                    break;
        case 7:System.out.println(" Anda akan membeli Machiato Small");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 10000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 10000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 10000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Andaharus bayar sejumlah = Rp."+harga);                       
                    }
                    else if( Toping == 0){
                        System.out.println(" Anda akan membeli Machiato Small tanpa Toping");
                        harga = 10000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                       
                    }                    
                    break;
        case 8:System.out.println(" Anda akan membeli Machiato Medium");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 15000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 15000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                         
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 15000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                         
                    }
                    else if( Toping == 0){
                        System.out.println(" Anda akan membeli Maachiato Medium tanpa Toping");
                        harga = 15000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }                    
                    break;
        case 9:System.out.println(" Anda akan membeli Machiato Large");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 20000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 20000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                       
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 20000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }
                    else if( Toping == 0){
                        System.out.println(" Anda akan membeli Machiato Large tanpa Toping");
                        harga = 20000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }                    
                    break;
        case 10:System.out.println(" Anda akan membeli Original Blend Small");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 11000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 11000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                     
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 11000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                      
                    }
                    if( Toping == 0){
                        System.out.println(" Anda akan membeli Original Blend Small tanpa Toping");
                        harga = 11000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                      
                    }
                    else if( jumlahbarang == 2 ){
                        System.out.println("Selamat Anda mendapatkan 1 Caffelatte Small setiap Pembelian 2 Original Blend");
                    }
                    break;
        case 11:System.out.println(" Anda akan membeli Original Blend Medium");
                System.out.print("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 16000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 16000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                         
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 16000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }
                    if( Toping == 0){
                        System.out.println(" Anda akan membeli Original Blend Medium tanpa Toping");
                        harga = 16000*jumlahbarang; 
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }
                    else if( jumlahbarang == 2 ){
                        System.out.println("Selamat Anda mendapatkan 1 Caffelatte Small setiap Pembelian 2 Original Blend");
                    }                    
                    break;
        case 12:System.out.println(" Anda akan membeli Original Blend Large");
                System.out.print  ("Masukkan Jumlah yang akan anda beli = ");
                    jumlahbarang = in.nextInt();
                    pilihan = 22000*jumlahbarang;                    
                    System.out.println("Jumlah Harga = Rp. "+pilihan);
                    System.out.println(" Pilih Toping :");
                    Toping = in.nextInt();
                    if( Toping == 1 ){
                        System.out.println("Anda akan membeli Toping Chococips");
                        harga = 5000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 22000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                        
                    }
                    if( Toping == 2 ){
                        System.out.println("Anda akan membeli Toping Susu Bubuk");
                        harga = 2000;
                        System.out.println("Harga Toping = Rp."+harga);
                        harga = 22000*jumlahbarang+harga;
                        System.out.println(" Total yang harus Anda harus bayar sejumlah = Rp."+harga);                       
                    }
                    if( Toping == 0){
                        System.out.println(" Anda akan membeli Original Blend Large tanpa Toping");
                        harga = 22000*jumlahbarang; 
                        System.out.println("Total yang harus Anda harus bayar sejumlah = Rp."+harga);                       
                    } 
                    else if( jumlahbarang == 2 ){
                        System.out.println("Selamat Anda mendapatkan 1 Caffelatte Small setiap Pembelian 2 Original Blend");
                    }
                    break;
        }System.out.println("Apakah anda ingin memesan yang lain ?\n1. Ya dong \n2. Gak dulu deh");
       System.out.print("Jawaban anda : ");       
       lagi = in.nextInt(); }while ( lagi ==1 );
        
            System.out.println("||=========================================== ||");
            System.out.println("||           >>> SUKA SUKA CAFFE <<<          ||");
            System.out.println("||         JL.AH.NASUTION KOTA BANDUNG        ||");
            System.out.println("|| - SEGARKAN HARIMU DENGAN SUKA SUKA CAFFE - ||");
            System.out.println("||         -TERIMAKASIH TELAH MEMESAN-        ||");
            System.out.println("||              -DATANG LAGI YA-              ||");
            System.out.println("||                -TERBAYAR-                  ||");
            System.out.println("||============================================||");
            System.out.println("||   Email         : SukasukaCaffe@gmail.com  ||");
            System.out.println("||   WIFI PASSWORD : sukacaffe09              ||");
            System.out.println("||   Instagram     : Sukasuka_caffe           ||");
            System.out.println("||   Whatsapp      : xxxxxxxxxxxx             ||");
            System.out.println("||Pemesanan online hanya melalui Wa dan GoFood||");
            System.out.println("||============================================||");
        
        }
}
    
/* Perbaikan Program :
    * Memperbaiki desain menu
    * Memperbaiki Looping menjadi Do While 
*  Yang ditambah :
    * Penambahan Switch case
    * Penambahan toping dan tanpa toping
    * Penambahan Variabel "lagi" untuk digunakan Loop
    * Menambahkan beberapa kata di Struk Pembayaran  
*  Yang Dihapus  :
    * Menghapus Variabel yang tidak digunakan     
*/    

