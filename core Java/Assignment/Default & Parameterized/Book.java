
class Book
{
int ISBN;
String Bname,Category;
double Price;

Book() //Default constructor
{
System.out.println("Constructor called");
this.ISBN=1120;
this.Bname="python Programming";
this.Category="Programming";
this.Price=200;
}

Book( int no , String Bn ,String cate , double p) //parametered constructor
{
System.out.println("Constructor called");
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
double getPrice()
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
Book b1;
b1=new Book();
b1.setISBN(10113);
b1.setBname("Database Management System");
b1.setCategory("DBMS");
b1.setPrice(525.00);

Book b2;
b2=new Book();
b2.setISBN(10118);
b2.setBname("java programming");
b2.setCategory("programming");
b2.setPrice(520.00);

Book b3;
b3=new Book();

Book b4;
b4=new Book(10114,"C programming", "programming language" ,250.0);


//System.out.println("ISBN:"+b1.ISBN+"/Book_name:"+b1.Bname+"/Book_Category:"+b1.Category+"/Book_Price:"+b1.Price);
if(b1.getPrice() >b2.getPrice())
{
System.out.println("b1 is Larger");
}
else
{
System.out.println("b2 is Larger");
}

b1.Display();
b2.Display();
b3.Display();
b4.Display();

}
}//class Book Test end here
