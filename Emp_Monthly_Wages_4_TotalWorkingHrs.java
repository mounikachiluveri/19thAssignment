public class Emp_Monthly_Wages_4_TotalWorkingHrs{
        private static final int IS_PART_TIME = 1;
        private static final int IS_FULL_TIME = 2;
        private static final int EMP_WAGE_PER_HOUR = 20;
        private static final int NUM_OF_WORKING_DAYS = 20;
        private static final int NUM_OF_WORKING_HRS = 100;

        public static void main(String[] args){
int empHrs = 0;
int empWage = 0;
                //intmonthlyWage = 0;
int totalWorkingDays = 0;
int totalEmpHrs = 0;

while(totalEmpHrs<=  NUM_OF_WORKING_HRS && totalWorkingDays<=NUM_OF_WORKING_DAYS)
{
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
totalEmpHrs += empHrs;
System.out.println("Day: " +totalWorkingDays+ "EmpHr: "+empHrs);

                        //System.out.println("EmpWage: "+empWage);
                        //monthlyWage = monthlyWage + empWage;

        }

empWage = EMP_WAGE_PER_HOUR * totalEmpHrs;
System.out.println("Total salary: "+empWage);
        }

}

