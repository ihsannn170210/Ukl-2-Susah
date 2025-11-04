import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta dimensi matriks (baris dan kolom)
        System.out.print("Masukkan jumlah baris matriks: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int cols = scanner.nextInt();

        // Inisialisasi matriks pertama
        int[][] matrix1 = new int[rows][cols];
        System.out.println("Masukkan elemen-elemen matriks pertama:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Inisialisasi matriks kedua
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Masukkan elemen-elemen matriks kedua:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Inisialisasi matriks hasil
        int[][] result = new int[rows][cols];

        // Penjumlahan matriks
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
