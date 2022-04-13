
import java.util.Scanner;
import java.util.Arrays;

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int k, n, arr[], i, l, result = 0;

        String desc = "TIDAK BISA";

        System.out.println("Menentukan Apakah Bisa Menjumlahkan 2 Angka Dari Array yang diberikan");
        System.out.print("Inputkan nilai k : ");
        k = scan.nextInt();

        System.out.print("Inputkan jumlah barisan : ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.println("Masukkan " + n + " angka");
        for (i = 0; i < n; i++) {
            System.out.print("Angka[" + (i) + "] : ");
            arr[i] = scan.nextInt();
        }

       for (i = 0; i < n; i++) {
           for (l = 0; l < n; l++) {
               if (arr[i] != arr[l]) {
                   if (arr[i] + arr[l] == k) {
                       result++;
                   }
                }
           }
        }
        if (result > 0) {
            desc = "BISA";
        }

        String arrValue = Arrays.toString(arr);
        System.out.println("Array yang dimasukkan adalah " + arrValue);
        System.out.println("Apakah mungkin? " + desc);
    }

}