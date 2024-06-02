package Assignments_kunal;

public class diff_sum_prod {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        int product = 1;
        while(num > 0) {
            sum += num % 10;
            product *= num % 10;
            num /= 10;

        }
        int ans = product - sum;
        System.out.println(ans);
    }
}

