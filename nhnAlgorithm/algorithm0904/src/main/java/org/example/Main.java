package org.example;

import java.util.Scanner;

public class Main {
    public static String solution(String input) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String result = null;
//        char[] array = new char[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
//                array[i] = (char) (s.charAt(i) + 32);
//            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
//                array[i] = (char) (s.charAt(i) - 32);
//            } else {
//                array[i] = s.charAt(i);
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            result=result.concat(array[i]);
//
//        }
//        return result;

        StringBuilder sb = new StringBuilder();

        char[] tokens = input.toCharArray();
        for(char token: tokens){
            if (65<=token && token <= 90)
                sb.append((char)(token+32));
            else if (97<=token&& token<=122) {
                sb.append((char)(token-32));
            }
            else {
                sb.append(token);
            }


        }
        return sb.toString();



    }
}
