public class DailyEmpWageSwitch
{
public static final int IS_PART_TIME=2;
public static final int IS_FULL_TIME=1;
public static final int WAGE_PER_HOUR=20;
public static void main(String[] args)
{
int Hours=0;
int Totalsalary=0;
int emp_Status=(int)((Math.random()*10)%3);
switch (emp_Status) {
  case 1:
 Hours=16;
 break;
  case 2:
 Hours=8;
 break;
default:
Hours=0;
}
Totalsalary=(WAGE_PER_HOUR*Hours);
System.out.println("Total salary="+Totalsalary);
}
}

