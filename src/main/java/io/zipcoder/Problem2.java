package io.zipcoder;

public class Problem2 {

    public static String fibonacciIteration(int n) {
        String countsequence = "";

        Integer count = 0;
        Integer next = 1;
        Integer current = count + next;
        for (int i = 0; i < n; i++){

            if (current > n){
                 countsequence += "";
                }

             else if (next < n) {
                current = count + next;
                countsequence += count + ", " + next + ", ";
                count += next;
                next += current;
            }
            else if  ((next > n) && (count < n)){
                countsequence+=count;
                count += next;
                next += current;
            }

        }
        return countsequence;
    }
}
