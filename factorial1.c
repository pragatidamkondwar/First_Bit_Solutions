#include<stdio.h>
void main()
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