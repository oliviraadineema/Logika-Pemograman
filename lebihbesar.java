import java.util.Scanner;

public class lebihbesar {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai yang anda inginkan : ");
        System.out.println("Number 1 : ");
        int number1 = scan.nextInt();
        System.out.println("Number 2 : ");
        int number2 = scan.nextInt();
        int score = 0;
        
        score = (number2 > number1)? number2:number1;
        System.out.println("nilai tertinggi : " +score);
        
    }
    
}