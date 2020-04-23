package Day5_Casting_Unary_ShortHandOperators;

    public class Divisibilitiy {
        public static void main(String[] args) {

            int number=65;

            //boolean divby2_3_5=number%2%3%5==0; -->works great//it works for combined condition.
            //mentor solution below
            boolean divBy2= number%2==0;
            boolean divBy3=number%3==0;
            boolean divBy5=number%5==0;

            String result1= number +" is divisible by 2 "+ divBy2;
            String result2= number +" is divisible by 3 "+ divBy3;
            String result3= number +" is divisible by 5 "+ divBy5;
            String finalresult=result1+"\n"+result2+ "\n"+result3;


            System.out.println(finalresult);







        }
}
