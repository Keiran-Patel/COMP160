/** COMP160 Lab2 2020
  * FlatBudget.java
  *
  * This class calculates the weekly donation to the flat account required from each person
 */
public class FlatBudget{
    public static void main(String[]args){
        int numberInFlat = 4;    // number of people sharing the total cost
        String MONTH = "July 2020";  // String description of this month
        int numDays = 31; // number of days in this month
        double numWeeksInMonth = numDays/7.0; // number of weeks in this month
        double groceriesWeekly = 210.0;       // grocery expenses
        double servicesMonthly = 279.0;  // power internet expenses
        double rentFortnightly = 824.0;       // rent expenses
        double servicesWeekly =  servicesMonthly / numWeeksInMonth;
        double rentWeekly = 824.0/2;
        String dollar = "$"; //place a string in, unlike python
        double expensesTotalPerWeek = 210.0 + 279.0/(31.0/7.0) + 824.0/2.0;
        double eachPersonPerWeek = (210.0 + 279.0/(31.0/7.0) + 824.0/2)/4.0; //change the monthly to weekly

        System.out.println("Expense total per week is " + expensesTotalPerWeek);
        System.out.println("Each Person pays " + dollar + eachPersonPerWeek + " weekly for " + MONTH);


     
    }
}