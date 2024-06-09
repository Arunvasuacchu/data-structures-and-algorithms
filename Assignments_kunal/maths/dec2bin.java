package Assignments_kunal.maths;

public class dec2bin {
    public static void main(String[] args) {
        int num =  44;
        System.out.println(bin2dec(num));
//        int a  = 12020202;
//        System.out.println( a << 2);
//        System.out.println(a *  2 * 2);
//        int n = 3;
//        int negation = -n;
//        System.out.println(negation);
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
