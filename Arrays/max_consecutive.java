public class max_consecutive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,};
        System.out.println(maxCons(arr));
    }
    static int maxCons(int[] nums) {
        int maxi = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;
            }
        }
        return maxi;
    }
}
