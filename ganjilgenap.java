import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        int bilangan ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai yang anda inginkan : ");
        bilangan = input.nextInt();
        
        if (bilangan % 2 == 0){
            System.out.println(Integer.toString(bilangan) + "adalah bilangan genap");
        } else {
            System.out.println(Integer.toString(bilangan) + "adalah bilangan ganjil");
        }
    }
}