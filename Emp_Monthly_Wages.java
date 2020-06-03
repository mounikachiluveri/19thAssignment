public class Emp_Monthly_Wages{
   private static final int IS_PART_TIME = 1;
   private static final int IS_FULL_TIME = 2;
   private static final int EMP_WAGE_PER_HOUR = 20;
   private static final int NUM_OF_WORKING_DAYS = 20;

   public static void main(String[] args){
      int empHrs = 0;
      int empWage = 0;
      int monthlyWage = 0;
      int totalWorkingDays = 0;

      while(totalWorkingDays <= NUM_OF_WORKING_DAYS){
         totalWorkingDays++;
         int emp_Check = (int)((Math.random()*10)%3);
 switch (emp_Check){
            case IS_FULL_TIME:
               empHrs=16;
               break;
            case IS_PART_TIME:
               empHrs=8;
               break;
            default:
               empHrs=0;
         }

         empWage = EMP_WAGE_PER_HOUR * empHrs;
         System.out.println("EmpWage: "+empWage);
         monthlyWage = monthlyWage + empWage;

   }

      System.out.println("Monthly salary: "+monthlyWage);
   }
}



