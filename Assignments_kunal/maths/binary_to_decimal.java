package Assignments_kunal.maths;

public class binary_to_decimal {
    public static void main(String[] args) {
        int  num = 10001000;
        System.out.println((bin2dec(String.valueOf(num))));
    }
    static int bin2dec(String nums) {
        int result = 0;
        int powof2 = 1;
        for(int i = nums.length() -1; i >= 0; i--) {
            if(nums.charAt(i) == '1') {
                result = result + powof2;
            }
            powof2 *= 2;
        }
        return result;
    }

}
