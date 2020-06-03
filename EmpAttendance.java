public class EmpAttendance
{
public static void main(String[] args)
{
int emp_Status=(int)((Math.random()*10)%2);
if(emp_Status == 1 )
{
System.out.println("Employee Present");
}
else
{
System.out.println("Employee Absent");
}
}
}


