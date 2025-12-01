#include<stdio.h>
void minute(int*);//function decleration
void main()
{
	int totalmin;
	printf("enter the totalmin");
	scanf("%d",&totalmin);
    minute(&totalmin);
	} //function call
 
 void minute(int *totalmin)//function defination
 {
  int  hours= *totalmin/60;
  int min= *totalmin%60;
	printf("convert hour %d",hours);
    printf("convert minute %d",min);

 }