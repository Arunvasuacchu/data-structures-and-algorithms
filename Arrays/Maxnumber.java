public class Maxnumber {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5};
        System.out.println(max(arr));
    }
    static int max(int[] num) {
        int max = num[0];
        for(int i = 0; i < num.length; i++) {
            if(num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
