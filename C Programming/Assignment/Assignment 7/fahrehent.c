#include<stdio.h>
void fahrehent(double*,double*);//function decleration
void main()
{
	double cel , fah ;
	printf("enter the celcius");
	scanf("%lf",&cel);
	fahrehent(&cel, &fah); //function call
}
//main function end here
void fahrehent(double *cel,double *fah)//function defination
{
	 *fah=(*cel*9/5)+32;
	printf("convert celsius to fahrenhent %lf",*fah);	
}
