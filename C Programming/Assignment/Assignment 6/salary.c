#include<stdio.h>
void salary();//function decleration
void main()
{
 salary();//function call
}
//main function end here
void salary()//function defination
{
double bs=7000 , ts;
	double da , ta , hra;
	if(bs<=5000)
		da=bs*0.10;
		ta=bs*0.20;
		hra=bs*0.25;
	else
		da=bs*0.15;
		ta=bs*0.25;
		hra=bs*0.30;	
	ts=bs+da+ta+hra;
	printf("ts=%lf",ts);
}