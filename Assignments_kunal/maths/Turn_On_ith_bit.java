package Assignments_kunal.maths;

public class Turn_On_ith_bit {
    public static void main(String[] args) {
        int n = 36;
        int i = 3;

        int onMask = 1 << i;
        System.out.println(n | onMask);
    }

}
