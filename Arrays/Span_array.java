public class Span_array {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        System.out.println(spanArray(arr));
    }

    static int spanArray(int[] num) {
        int max = num[0];
        int min = num[0];
        for (int j : num) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        return max - min;

    }

}
