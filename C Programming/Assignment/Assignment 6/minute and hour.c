#include<stdio.h>
void minute();//function defination
void main()
{
	minute();//function call
 }
 //main function end here 
 void minute()//function defination
 {
 
 int totalmin = 80 ,  hours, min ;
	hours= totalmin/60;
	min= totalmin%60;
	printf("convert hour %d",hours);
    printf("convert minute %d",min);
}