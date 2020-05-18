package Day38_Constructors;

import javax.crypto.spec.PSource;

public class SalaryCalculator {
    /*
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
     */
    double hourlyRate;
    double stateTaxRate;
    double federalTaxRate;
    int weeklyHours;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;

    }

    public double stateTax() {
        return salary() * stateTaxRate;
    }

    public double federalTax() {
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax() {
        return salary() - stateTax() - federalTax();
    }

    public String toString() {
        return "Hourly Rate: " + hourlyRate +
                "\nWeekly Hours: " + weeklyHours + "" +
                "\nGross Salary: " + salary() +
                "\nState Tax: " + stateTaxRate +
                "\nFederal Tax: " + federalTaxRate +
                "\nNet Salary: $" + salaryAfterTax();
    }

}

class employeeSalary{
    public static void main(String[] args) {
        SalaryCalculator employee1=new SalaryCalculator(21,40,7.65/100,0);
        System.out.println(employee1);
    }
}
