package org.example;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println(
                    "Test Case " + (i + 1) + " = " + test(TEST_CASES[i][0], TEST_CASES[i][1], TEST_CASES_RESULTS[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
    }


    private static boolean test(int start, int end, int result) {
        if (solution(start, end) == result) {
            correct++;
            return true;
        }

        return false;
    }


    private static double correct = 0;

    private static final int[][] TEST_CASES = {
            {1, 1},
            {98,49},
            {2,81},
            {3,7},
            {19,87},
            {1,40},

    };

    private static final int[] TEST_CASES_RESULTS = {
            1,
            98,
            162,
            21,
            1653,
            40
    };
    public static int gcd(int first, int second){

        if(second==0)
            return first;
        return gcd(second, first%second);
    }

    // solution
    private static int solution(int first, int second) {
        int max= Math.min(first, second);//같은 숫자가 들어가면 제공된 두 숫자중 하나를 그대로 반환
        int min= Math.max(first,second);
        int result=max*min/gcd(max,min);
        return result;
    }


}
