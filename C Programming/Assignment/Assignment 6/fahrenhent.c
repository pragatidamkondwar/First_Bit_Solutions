#include<stdio.h>
void fahrenhent();//function decleration
void main()
{
fahrenhent();//function call	
}
//main function end here
void fahrenhent()//function defination
{
	 double cel= 24, fah;
	 fah=(cel*9/5)+32;
	 printf("convert celsius to fahrenhent %lf",fah);
}