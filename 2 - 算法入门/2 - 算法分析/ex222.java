public class ex222{
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    index = j;
                }
            }
            a[index] = a[i];
            a[i] = min;
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }
}