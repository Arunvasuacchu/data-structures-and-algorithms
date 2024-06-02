package Assignments_kunal;

import java.util.Scanner;

public class stop_user_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while(true) {
            int n = in.nextInt();
            if(n == 0) {
                break;
            } else {
                num += n;
            }
        }
        System.out.println(num);
    }
}
