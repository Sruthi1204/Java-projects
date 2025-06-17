import java.util.*;

public class nqueen {
    static int n = 4;

    public static void main(String[] args) {
        int[][] ar = new int[n][n];
        solve(ar, 0);
    }

    static void solve(int[][] arr, int r) {
		print(arr);
            System.out.println();
            return;
        }
        for (int c = 0; c < n; c++) {
            if (safe(arr, r, c)) {
                arr[r][c] = 1;
                solve(arr, r + 1);
                arr[r][c] = 0;
            }
        }
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean safe(int[][] arr, int r, int c) {

        for (int i = 0; i < r; i++) {
            if (arr[i][c] == 1) return false;
        }

        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) return false;
        }
        for (int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++) {
            if (arr[i][j] == 1) return false;
        }

        return true;
    }
}
