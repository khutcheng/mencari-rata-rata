/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan1;

/**
 *
 * @author rizal
 */
public class Percobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 
    2, 10}}; 
        for (int[] data1 :data){
            for (int b   = 0; b < data[0].length; b++) {
                System.out.print(data1[b] + "");
            }
            System.out.println();
        }
        int total = 0;
        int jumlah = 0;
        int jumlahGanjil = 0;
        for (int a = 0; a<data.length; a++){
            for (int b = 0; b<data[a].length; b++){
        int nilai = data [a][b];        
            total += nilai;
            jumlah++;
            
            if (nilai %2 != 0){
                jumlahGanjil++;
            }
        }
    }
        double rataRata = total / jumlah;
        System.out.println("Total nilai :" + total);
        System.out.println("jumlah elemen :"+jumlah);
        System.out.println("Nilai rata-rata :" + rataRata );
        System.out.println("jumlah elemen ganjil :" + jumlahGanjil);
       
    }
    
}

