package Day1_5;

public class ContinueVariables {

    public static void main(String[] args) {

        double hourlyRate=55;
        double stateTaxRate=0.04;
        double federalTaxRate=0.02;
        byte weeklyHours=40;
        byte totalWeeks=52;

        double salary=hourlyRate*weeklyHours*totalWeeks;
        double stateTax=salary*stateTaxRate;
        double federalTax=salary*federalTaxRate;

        double salaryAfterTax=salary-(stateTax+federalTax);

        System.out.println("State Tax: "+stateTax);
        System.out.println("Federal Tax: "+federalTax);

        System.out.println("Your net salary is "+ "$"+salaryAfterTax);







    }
}
