// public class Test{
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 8, 16, 16, 16};
//         int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE, t = Integer.MIN_VALUE;
//         for (int num : arr) {
//             if (num > f) {
//                 t = s;
//                 s = f;
//                 f = num;
//             } else if (num > s && num != f) {
//                 t = s;
//                 s = num;
//             } else if (num > t && num != f && num != s) {
//                 t = num;
//             }
//         }
//         System.out.println(t);
//     }
// }

public class Test {
    public static void main(String[] args) {
        int n = 75;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
