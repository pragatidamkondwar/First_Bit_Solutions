class Bank
{
void approveLoan(int rollno , String Name , double percentage)//Student
{
System.out.println("Student Loan");
if(percentage >80)
{
System.out.println("Loan Approved 2 lakh:");
}
else if( percentage >=60 && percentage <=80)
{
System.out.println("Loan Approved 1 lakh");
}
else if( percentage >=40 && percentage <60)
{
System.out.println("Loan Approved 50 thousands");
}
else
{
System .out.println("No Loan");
 }
}

void approveLoan(int id  , double AnnualSalary, String Name)//Employee
{
System.out.println("Employee Loan");
if (AnnualSalary >12)
{
System.out.println("Loan Approved : 7 lakh");
}
else if(AnnualSalary >=10 && AnnualSalary <=12)
{
System.out.println("Loan Approved : 6 lakh");
}
else if(AnnualSalary >=6 && AnnualSalary <10)
{
System.out.println("Loan Approved : 5 lakh");
}
else if(AnnualSalary >=4 && AnnualSalary <6)
{
System.out.println("Loan Approved : 4 lakh");
}
else
{
System.out.println("No Loan Approved");
  }
 }
}
// class Bank end here

class BankTest
{
public static void main(String [] args)
{
Bank b1;
b1 = new Bank();
b1.approveLoan(101 ,"pwq",89);

Bank b2;
b2 = new Bank();
b2.approveLoan( 1 , 5,"zqw");
 }
}








