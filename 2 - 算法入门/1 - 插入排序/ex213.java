public class ex213{
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};
        int v = 1;
        int i;
        boolean found = false;
        for (i = 0; i < a.length; i++) {
            if (a[i] == v) {
                found = true;
                System.out.println(i);
                break;
            }
        }
        if (!found) System.out.println("NIL");
    }
}