import java.math.BigDecimal;
// split 함수를 사용해서 나누어준 결과.
// 배운점: gcd함수를 사용할때는 절댓값으로 

public class algorithm0914 {



        public static class Fraction {
            private int numerator;  // 분자
            private int denominator;    // 분모

            public Fraction(int numerator, int denominator) {
                this.numerator = numerator;
                this.denominator = denominator;

                normalize();
            }

            public int getNumerator() {
                return numerator;
            }

            public int getDenominator() {
                return denominator;
            }
            public int gcd(int first, int second){
                if(second==0){
                    return first;
                }
                return gcd(second,first%second);
            }

            public void normalize() {
                int gcd = gcd(Math.abs(getDenominator()), Math.abs(getNumerator()));
                this.denominator = getDenominator()/gcd;
                this.numerator =getNumerator()/gcd;

            }

            @Override
            public String toString() {
                return String.valueOf(getNumerator())+"/"+String.valueOf(getDenominator());
            }
        }

        /**
         * 소수점 값에 대해 자리 수 계산 하는 메서드.    <br/>
         * ex)  <br/>
         * 0.01 -> 100을 곱하기 위해 2를 return    <br/>
         * 0.1 -> 10을 곱하기 위해 1을 return
         *
         *
         * @param num   소수 값
         * @return      소수점 이하 자리 수 값
         */
        public static int getDecimalNumber(BigDecimal num) {
            String str = num.toPlainString();
            String [] array = str.split("\\.");

            int result = array[1].length();

            return result;
        }

        public static String solution(String input) {
            BigDecimal number = new BigDecimal(input);


            int decimalNumber = getDecimalNumber(number);


            double denominator = Math.pow(10,decimalNumber);
            int numerator = (int)(Double.parseDouble(input)*denominator);



            return new Fraction(numerator, (int) denominator).toString();
        }

        public static void main(String[] args) {
            System.out.println(solution("-0.1"));
            System.out.println(solution("-0.5"));

        }

    }
