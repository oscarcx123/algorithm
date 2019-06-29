public class ex212{
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            for (; i >= 0 && a[i] < key; i--) a[i + 1] = a[i];
            a[i + 1] = key;
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }
}