#include<stdio.h>
void main()
{
 
 int totalmin = 80 ,  hours, min ;
	hours= totalmin/60;
	min= totalmin%60;
	printf("convert hour %d",hours);
    printf("convert minute %d",min);
}