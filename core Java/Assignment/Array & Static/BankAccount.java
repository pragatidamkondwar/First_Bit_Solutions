import java.util.Scanner;
class BankAccount
{
int accountNumber;
String HolderName;
double currentBalance;
static double interestRate;

static
{
interestRate=12.3;
}



BankAccount() //Default constructor
{
System.out.println(" Default Constructor called");
this.accountNumber=101;
this.HolderName="aqe";
this.currentBalance=1000;
//this.interestRate=10;
}

BankAccount( int i , String str , double d1 ) //parameterized constructor
{
System.out.println("parameterized Constructor called");
this.accountNumber=i;
this.HolderName=str;
this.currentBalance=d1;
//this.interestRate=d2;
}

void setaccountNumber(int x){
this.accountNumber=x;
}

void setHolderName(String y){
this.HolderName=y;
}

void setcurrentBalance(double A){
this.currentBalance=A;
}

 static void setinterestRate(double B){
interestRate=B;
}
//setter ends here

int getId(){
return this.accountNumber;
}

String getHolderName(){   
return this.HolderName;
}

double  getcurrentBalance(){
return this.currentBalance;
}

double getinterestRate(){
return this.interestRate;
}
// getter ends here

void Display()
{
System.out.println("\n accountNumber is:"+this.accountNumber);
System.out.println("HolderName is :"+this.HolderName);
System.out.println("currentBalance is :"+this.currentBalance);
System.out.println("interestRate is :"+this.interestRate);
 }
}//BankAccount ends here


class BankAccountTest{

public static void main (String [] args)
{

BankAccount b1=new BankAccount(111,"qeqw",12314);
b1.Display();

BankAccount b2=new BankAccount(112,"reyrty",141345);
b2.Display();

BankAccount b3=new BankAccount(113,"yryuyt",165658);
b3.Display();

BankAccount.setinterestRate(7.8);
b1.Display();
b2.Display();
b3.Display();



/*Scanner sc=new Scanner ( System.in);
System.out.println("Enter the Account Number");
int a = sc.nextInt();

sc.nextLine(); 

System.out.println("Enter the HolderName");
String str = sc.nextLine();

System.out.println("Enter the current Balance");
double d1 = sc.nextDouble();

System.out.println("Enter the interestRate");
double d2= sc.nextDouble();*/

 }
}
//BankAccountTest end here
