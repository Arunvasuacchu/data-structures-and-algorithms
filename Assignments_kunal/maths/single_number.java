package Assignments_kunal.maths;


// number appear twice and return single number.
public class single_number {
    public static void main(String[] args) {
        int[] arr = {-1,-1,-2,-2,-3,4,4};
        System.out.println(single(arr));
    }
    static int single(int[] nums) {
        int sn = 0;
        for(int num : nums) {
            sn = sn ^ num;
        }
        return sn;
    }
}

// space - O(1)
// time - O(n)
