public class CobaArray {

   
    public static void main(String[] args) {
        
        String[] Bulan; //Deklarasi Array
        
        Bulan = new String[12]; //Menentukan jumlah elemen dan Panjang Array
        int[] JumlahHari ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Bulan[0] = "Januari";
        Bulan[1] = "Februari";
        Bulan[2] = "Maret";
        Bulan[3] = "April";
        Bulan[4] = "Mei";
        Bulan[5] = "Juni";
        Bulan[6] = "Juli";
        Bulan[7] = "Agustus";
        Bulan[8] = "September";
        Bulan[9] = "Oktober";
        Bulan[10]="November";
        Bulan[11]="Desember";
        
        for (int i = 0; i < Bulan.length; i++){
            System.out.println("Bulan "+Bulan[i]+" Memiliki " + JumlahHari[i]+ " Hari");
        }
    }
    
}
