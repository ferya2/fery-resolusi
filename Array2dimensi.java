public class Array2dimensi {
// ARRAY 2 DIMENSI
    
    public static void main(String[] args) {
        // Pendeklarasian Array 2 Dimensi
        String Bulan[][] ={{"Januari", "31"},{"Februari", "28"},{"Maret", "31"},
        {"April", "30"},{"Mei", "30"},{"Juni", "30"},{"Juli", "31"},{"Agustus", "31"},
        {"September", "31"},{"Oktober", "31"},{"November", "30"},{"Desember", "31"}};
        
        // Pengeksekusian dari Line
        for (int i = 0; i < Bulan.length; i++){
            System.out.println("Bulan "+ Bulan[i][0] + " Memiliki " + Bulan[i][1] + " Hari");
        }
        
        }
    }
