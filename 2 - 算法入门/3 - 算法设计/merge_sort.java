//利用分治法递归求解
public class merge_sort{
    public static void main(String[] args) {
        //定义数组A，排序上下界下标p,r
        //double[] A = {1, 3, 2, 9, 5, 4, 2, 7, 6, 9, 8, 4, 6, 3, 5, 2, 6};
        double[] A = {5, 2, 4, 7, 1, 3, 2, 6};
        int p = 0;
        int r = A.length - 1;
        mergeSort(A, p, r);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
    public static void mergeSort(double[] A, int p, int r) {
        //不断切割数组直到只剩下一个元素
        if (p < r) { 
            int q = (int) Math.floor(((double) (p + r)) / 2.0 );
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
        
    }
    public static void merge(double[] A, int p, int q, int r) {
        //计算左右两个牌堆的元素个数。值得注意的是，创建的元素个数会比实际需要排列的元素个数多出一个，这是留给后面要放进去的“哨兵牌”的。
        int n1 = q - p + 1;
        int n2 = r - q;
        //创建左右两个牌堆
        double[] L = new double[n1 + 1];
        double[] R = new double[n2 + 1];
        //将原数组A中对应范围的部分复制进两个牌堆
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + j + 1];
        }
        // 在两堆牌的末尾放置“哨兵牌”(sentinel card)，这样可以避免检查牌堆为空。此处选用正无限大，所以每当看到无限大时，它不可能是两张牌中较小的一张；看到两张无限大，代表已经完成本轮操作。
        L[n1] = Double.POSITIVE_INFINITY;
        R[n2] = Double.POSITIVE_INFINITY;
        //此处为两堆已经排序的牌面朝上的扑克牌，最小的牌在最上面。我们抓起两个牌堆中最上面的一张，找出较小的，放到输出堆中（实际上是覆盖数组A原来的元素）
        //i和j两个变量代表两个牌堆的index，p和r对应的是在原数组A选取的index范围。
        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (L[i] == Double.POSITIVE_INFINITY && R[j] == Double.POSITIVE_INFINITY) break;
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
        }
    }
}