import java.util.Scanner;   
public class penjumlahan {
    public static void main (String [] args){
       
        Scanner input = new Scanner(System.in); 
        int angka1,angka2,hasil;
       
        System.out.print("Angka 1\t:");  
        angka1=input.nextInt();         
       
        System.out.print("Angka 2\t:"); 
        angka2=input.nextInt();     
   
        hasil=angka1+angka2;  
       
        =
        System.out.println("\nMenampilkan Hasil :");
        System.out.println(angka1+" + "+angka2+" = "+hasil);      
    }
}