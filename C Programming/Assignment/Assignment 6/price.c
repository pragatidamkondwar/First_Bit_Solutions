#include<stdio.h>
void isstudent();//function decleration
void price();
void main()
{
	isstudent();//function call
	price();
}
//main function end here
void isstudent()
{
	char student;
	double  price=5000 , total_p;
	if(student=='y')
		if(price>500)
			total_p=price-price*0.20;
		else
			total_p=price-price*0.10;
}
void price()
{
	  double  price=5000 , total_p;
		if(price>600)
				total_p=price-price*0.15;
			else
				total_p=price-0;
			printf("final price%lf",total_p);
			
}