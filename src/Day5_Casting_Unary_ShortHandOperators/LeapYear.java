package Day5_Casting_Unary_ShortHandOperators;


    public class LeapYear {
        public static void main(String[] args){

            short year=2020;
            //LeapYear:year%4 ==0
            //if returns true -->leap year, if returns false---> not leap year

            boolean leapYear=year%4==0;
            //System.out.println(year +" is leap year: "+ leapYear);
            String result= year + " is leap year: " + leapYear;
            System.out.println(result);








        }
}
