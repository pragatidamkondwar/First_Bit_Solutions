import java.util.Scanner;
class Book
{
int ISBN;
String Bname,Category;
double Price;

Book() //Default constructor
{
System.out.println(" Default Constructor called");
this.ISBN=1120;
this.Bname="python Programming";
this.Category="Programming";
this.Price=200;
}

Book( int no , String Bn ,String cate , double p) //parametered constructor
{
System.out.println(" parameterized Constructor called");
this.ISBN=no;
this.Bname=Bn;
this.Category=cate;
this.Price=p;
}

void setISBN(int a){
this.ISBN=a;
}

void setBname(String b){
this.Bname=b;
}

void setCategory(String c){
this.Category=c;
}

void setPrice(double d){
this.Price=d;
}
//setter ends here

int geISBN(){
return this.ISBN;
}

String getBname(){
return this.Bname;
}          

String getCategory(){
return this.Category;
}   
     
double getPrice(){
return this.Price;
}

//getter ends here
          
void Display (){
System.out.println("ISBN no"+this.ISBN);
System.out.println("Bname is"+this.Bname);
System.out.println("Category is"+this.Category);
System.out.println("Price is"+this.Price);
}

}//class Book ends here

class BookTest
{
public static void main (String [] args)
{
Scanner sc=new Scanner ( System.in);

Book [] arr = new Book [3];
arr[0]=new Book();
arr[1]=new Book(1,"java","programming",250);
for(int i=0;i<3;i++){
System.out.println(arr[i]);
arr[i].Display();
}
System.out.println("Enter the ISBN");
int a = sc.nextInt();

sc.nextLine();

System.out.println("Enter the Book Name");
String str = sc.nextLine();


System.out.println("Enter the Category");
String str1 = sc.nextLine();

System.out.println("Enter the Price");
double d2= sc.nextDouble();

Book b1;
b1=new Book( a , str , str1 , d2);

b1.Display();
}
}//class Book Test end here
