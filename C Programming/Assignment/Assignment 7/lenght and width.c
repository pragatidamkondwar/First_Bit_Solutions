#include<stdio.h>
void minute(int , int);//function decleration
void main()
{
	int hours , min;
    minute(hours,min); //function call
 } 
 void minute( int hours, int min )//function defination
 {
 	int totalmin=80 ;
    hours= totalmin/60;
	min= totalmin%60;
	printf("convert hour %d",hours);
    printf("convert minute %d",min);

 }