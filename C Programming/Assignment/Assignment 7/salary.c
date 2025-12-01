#include<stdio.h>
void salary(double*);//decleration
void main()
{
	double bs;
	printf("enter the basic salary");
	scanf("%lf",&bs);
	salary(&bs);//call
}
// main end here
 void salary(double *bs)//defination
 {
 	double da , ta , hra , ts;
	if(*bs<=5000){
	
		da=*bs*0.10;
		ta=*bs*0.20;
		hra=*bs*0.25;
	}
	else{
	
		da=*bs*0.15;
		ta=*bs*0.25;
		hra=*bs*0.30;
	}
	ts=*bs+da+ta+hra;
	printf("ts=%lf",ts);
 	
 }