import java.util.Arrays;

class doubleArray {
    void check(int[][] arr, int i, int j) {
        int start = arr[i][j];
        int len = arr[i][j];
        if (arr[i][j + 1] == start && arr[i][j + 1] <= arr[len][len]) {
            arr[i][j - 1] = 9;
            check(arr, i, j);
        }
        if (arr[i][j - 1] == start && arr[i][j - 1] <= arr[len][len]) {
            arr[i][j - 1] = 9;
            check(arr, i, j);
        }
        if (arr[i + 1][j] == start && arr[i + 1][j] <= arr[len][len]) {
            arr[i][j - 1] = 9;
            check(arr, i, j);
        }
        if (arr[i - 1][j] == start && arr[i - 1][j] <= arr[len][len]) {
            arr[i][j - 1] = 9;
            check(arr, i, j);
        }

    }
}

class zom {
    public static void main(String[] args) {

        doubleArray da = new doubleArray();
        int[][] mat = { { 8, 0, 8 }, { 0, 8, 8 }, { 0, 8, 0 } };
        int len = mat.length;
        int start = mat[2][2];
        int i = 2;
        int j = 2;
        if (mat[i][j - 1] == start && mat[i][j - 1] <= mat[len][len]) {
            mat[i][j - 1] = 9;
            da.check(mat, i, j);
        }
        if (mat[i][j + 1] == start && mat[i][j + 1] <= mat[len][len]) {
            mat[i][j - 1] = 9;
            da.check(mat, i, j);
        }
        if (mat[i + 1][j] == start && mat[i + 1][j] <= mat[len][len]) {
            mat[i][j - 1] = 9;
            da.check(mat, i, j);
        }
        if (mat[i - 1][j] == start && mat[i - 1][j] <= mat[len][len]) {
            mat[i][j - 1] = 9;
            da.check(mat, i, j);
        }

        System.out.println(Arrays.toString(mat));
    }
}