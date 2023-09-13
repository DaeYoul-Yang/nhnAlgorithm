


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int[] array = {10, 20, 30, 40};





        System.out.println(solution(array));

    }


    public static int solution(int[] input) {
        int[] result = new int[100];
        int max = 0;


        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int min = Math.min(input[i], input[j]);
                for (int k = 1; k <= min; k++) {
                    if (input[i] % k == 0 && input[j] % k == 0) {
                        if (max < k) {
                            max = k;
                        }
                    }

                }
            }


        }


        return max;
    }

}
