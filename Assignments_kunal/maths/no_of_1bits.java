package Assignments_kunal.maths;

public class no_of_1bits {
    public static void main(String[] args) {
        int n = 11;
        int count= 0;
        while(n > 0) {
            n = n & n - 1;
            count++;

        }
        System.out.println(count);

    }
}
