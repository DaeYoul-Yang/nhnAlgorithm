import java.math.BigDecimal;

public class Main {

    public static class Fraction {
        private int numerator;  // 분자
        private int denominator;    // 분모

        private boolean minus;

        public Fraction(int numerator, int denominator, boolean minus) {
            this.numerator = numerator;
            this.denominator = denominator;
            this.minus=minus;

            normalize();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }
        public boolean getminus(){
            return minus;
        }
        public static int gcd(int first, int second){
            if(second==0){
                return first;
            }
            return gcd(second,first%second);
        }

        @Override
        public String toString() {
            if(getminus())
                return "-"+getNumerator()+"/"+getDenominator();
            return getNumerator()+"/"+getDenominator();
        }

        public void minus(String input){
            if(input.charAt(0)=='-')
                this.minus=true;
        }




        public void normalize() {
            int gcd = gcd(getNumerator(),getDenominator());

            this.numerator=getNumerator()/gcd;
            this.denominator=getDenominator()/gcd;


        }


    }

    /**
     * 소수점 값에 대해 자리 수 계산 하는 메서드.    <br/>
     * ex)  <br/>
     * 0.01 -> 100을 곱하기 위해 2를 return    <br/>
     * 0.1 -> 10을 곱하기 위해 1을 return
     *
     * @param num 소수 값
     * @return 소수점 이하 자리 수 값
     */
    public static int getDecimalNumber(BigDecimal num, boolean minus) {
        String str = num.toPlainString();
        int dotnum=0;
        if(minus==false)
            dotnum=str.length()-2;
        else
            dotnum=str.length()-3;



        return dotnum;
    }

    public static String solution(String input) {

        BigDecimal number = new BigDecimal(input);

        boolean minus=false;

        if(input.charAt(0)=='-'){
            input=input.substring(1,input.length());
            minus = true;
        }
        int decimalNumber = getDecimalNumber(number , minus);



        double denominator = Math.pow(10,decimalNumber);
        int numerator = Integer.valueOf(input.substring(2,input.length()));// 자릿수 곱하면 결과 나오네..



        return new Fraction(numerator, (int) denominator,minus).toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("0.125"));
        System.out.println(solution("0.1"));
        System.out.println(solution("0.6"));
        System.out.println(solution("-0.1"));

    }
}
