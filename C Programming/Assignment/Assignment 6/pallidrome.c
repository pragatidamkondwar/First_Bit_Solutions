#include<stdio.h>
void pallidrome();//function decleration
void main()
{
	pallidrome();//function call
	
}
//main function end here
void pallidrome()//function defination
{
int no=123, r1,r2,r3 , rev;
	int q1,q2;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	if(no==rev)
	{
		printf("it is pallidrome no");
	}
	else
	{
		printf("it is not pallidrome no");
	}
}