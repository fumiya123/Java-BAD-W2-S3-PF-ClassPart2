import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array 1 Dimensi
        System.out.println("=== Operasi Array 1 Dimensi ===");
        System.out.print("Masukkan ukuran array: ");
        int n = scanner.nextInt();
        int[] array1D = new int[n];

        // isi elemen array 1 dimensi
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array1D[i] = scanner.nextInt();
        }

        // print elemen array 1 dimensi
        System.out.println("Isi array 1 dimensi:");
        for (int num : array1D) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Array 2 Dimensi
        System.out.println("\n=== Operasi Array 2 Dimensi ===");
        System.out.print("Masukkan jumlah baris: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int cols = scanner.nextInt();
        int[][] array2D = new int[rows][cols];

        // isi elemen array 2 dimensi
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Masukkan elemen [" + i + "][" + j + "]: ");
                array2D[i][j] = scanner.nextInt();
            }
        }

        // print  elemen array 2 dimensi
        System.out.println("Isi array 2 dimensi:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        // closing program
        scanner.close();
        System.out.println("\nProgram selesai.");
    }
}
