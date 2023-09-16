package org.example;



import java.util.Scanner;

public class Main {

    private static double correctCount = 0;

    private static final String[][] TESTCASES = new String[][] {
            {"123", "123", "246"},
            {"1000", "1", "2"},
            {"456", "789", "1461"},
            {"5", "5", "1"},
            {"11112", "54321", "65433"},
            {"3829", "1300", "4139"}
    };

    public static void main(String[] args) {
//        for (int i = 0; i < TESTCASES.length; i++)
//            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));
//
//        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
        Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        System.out.println(reverse(number1));
        //System.out.println(getChange(6,5));
    }

    private static boolean test(String input, String input2, String answer) {
        int first = Integer.parseInt(input);
        int second = Integer.parseInt(input2);

        boolean res = String.valueOf(solution(first, second)).equals(answer);
        if (res)
            correctCount++;
        return res;
    }

//    public static int reverse(int a){
//        String sb =String.valueOf(a);
//        char array[]= new char[sb.length()];
//        int result=0;
//        for (int i = 0; i < sb.length(); i++) {
//            array[sb.length()-i-1]=sb.charAt(i);
//
//        }
//        result=Integer.parseInt(String.valueOf(array));
//        return result;
//
//
//    }

    public static  int getChange(int i, int j ){
        int a=0;
        int result=0;

            a=i/j;
            result = i-a*j;


        return result;
    }

    public static int reverse(int n){
        int count=0;
        int num=0;
        int n1=n;
        while(true){
            count++;
            n=n/10;
            if(n<10){
                break;
            }
        }
        count++;
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = getChange(n1,10);
            n1/=10;
        }
        for(int ar: arr){
            num *= 10;
            num += ar;
        }
        return num;

    }

    public static int reverse1 (int number){
        int result=0;
        while(number>0){
            result=result*10 + number%10;
            number=number/10;
        }
        return result;
    }

    public static  int reverseRecurcive(int number, int result){
        if(number==0){
            return result;
        }
        else{
            result=result*10+number%10;
            return reverseRecurcive(number/10,result);
        }
    }

//    static int reverse(int n){
//        char[]arr = String.valueOf(n).toCharArray();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = arr.length; i >-1 ; i--) {
//            sb.append(arr[i]);
//
//        }
//        return Integer.parseInt((sb.toString());
//    }

    // solution
    public static int solution(int a, int b) {

//        Scanner sc = new Scanner(System.in);
//        int number1= sc.nextInt();
//        int number2= sc.nextInt();
//        int result=0;
//        result=reverse(number1)+reverse(number2);
//        System.out.println(reverse(result));
//        return reverse(result);



    return 0 ;


    }
}
