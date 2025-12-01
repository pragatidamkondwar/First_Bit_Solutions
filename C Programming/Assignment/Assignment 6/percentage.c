#include<stdio.h>
void percentage();//function decleration
void main()
{
	percentage();//function call
	
}
//main function end here
void percentage()//function defination
{
	float sub1 = 80,sub2 = 50 , sub3= 67 , sub4= 85 ,sub5 = 90 , marks , percentage;
    marks= sub1+sub2+sub3+sub4+sub5;
    printf("total marks %f",marks);
    percentage= marks/500*100;
    printf("percentage of marks %f", percentage);
    
	
}
