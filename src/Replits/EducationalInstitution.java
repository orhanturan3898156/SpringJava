package Replits;

public class EducationalInstitution {
    private int years;

    public EducationalInstitution(int years){
        this.years=years;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    /*
        a method graduationRequirements that returns a String.
        The (default) behavior of graduationRequirements is to return a String stating "d years of study",
        where d is the value of the duration instance variable
         */
    public String graduationRequirements(){

        String result=years+ " years of study";
        return result;
    }

}
class LawSchool extends EducationalInstitution{
    public LawSchool(int years) {
        super(3);
    }
    /*
    a (default) constructor that invokes the superclass constructor with the value 3
    (law school is typically a three year program).

    a (overridden) method graduationRequirements that returns the string "3 years of study and passing the bar".
    You MUST invoke the graduationRequirements method of the superclass in this method
     (to obtain the first portion of the resulting string).
     */
    public String graduationRequirements(){
        int years = getYears();
        String result=years+ " years of study";
        return result;
    }

}
