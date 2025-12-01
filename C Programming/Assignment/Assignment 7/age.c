#include<stdio.h>
void ages(int*);//decleration
void main()
{
	int a;
	printf("enter the age");
	scanf("%d",&a);
	ages(&a);//call
	
}// main end here
void ages(int* age)
{
	if(*age<12)
	{
		printf("child");
	}
	else
	{
		if(*age>=12 && *age<19)
		{
			printf("teenager");
		}
		else
		{
			if(*age>=20 && *age<=59)
			{
              printf("Adult");				
			}
			else
			{
				printf("Senior");
			}
		}
	}
}