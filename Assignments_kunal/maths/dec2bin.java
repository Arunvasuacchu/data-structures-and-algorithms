package Assignments_kunal.maths;

public class dec2bin {
    public static void main(String[] args) {
        int num =  33;
        System.out.println(bin2dec(num));
    }
    static String bin2dec(int nums) {

        StringBuilder binary = new StringBuilder();
        while(nums >= 1) {
            int rem = nums % 2;
            nums /= 2;
            binary.insert(0, rem);
        }
        return binary.toString();
    }
}
