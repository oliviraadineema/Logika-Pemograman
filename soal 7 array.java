import java.util.Scanner;
import java.util.Arrays;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, arr[], i, nilai, l, result = 0;

        String desc = "TIDAK ADA";

        System.out.println("Menentukan Apakah ada nilai yang sama di dalam array yang diberikan");

        System.out.print("Inputkan jumlah N : ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.println("Masukkan " + n + " angka");
        for (i = 0; i < n; i++) {
            System.out.print("Angka[" + (i) + "] : ");
            arr[i] = scan.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (l = i + 1; l < n; l++) {
                if (arr[i] == arr[l]) {
                    result++;
                }

            }
        }

        if (result > 0) {
            desc = "ADA";
        }

        String arrValue = Arrays.toString(arr);
        System.out.println("Array yang dimasukkan adalah " + arrValue);
        System.out.println("Apakah mungkin? " + desc);
    }
    
}