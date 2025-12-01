#include<stdio.h>
void factorial();//function decleration
void main()
{
	factorial();//function call
	
}
// main function end here
void factorial()
{
	
	int no=5 , i=no;
	int fact=1;
	{
		while(i>1)
		{
			fact=fact*i;
			i--;
		}
		printf("factorial %d is %d",no,fact);
	}
}