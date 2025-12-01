#include<stdio.h>
void flnumber();//function decleration
void main()
{
	flnumber();//function call
}
//main function end here
void flnumber()//function defination
{
		int no=12345 , ld, fd;
		int sum;
		ld=no%10;
		while(no>0)
		{
			fd=no%10;
		    no=no/10;	
		}
		sum=ld+fd;
	printf("sum of fd and ld digit %d ",sum);
}