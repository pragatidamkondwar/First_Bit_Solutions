#include<stdio.h>
void divide();//function decleration
void main()
{
	divide();//function call
	
}
//main function end here
void divide()
{
	int no=5;
	if(no%3==0 || no%5==0) 
		if(no%3==0 && no%5==0) 
			printf("divisible by both");
		else 
			if(no%3==0 && no%5!=0) 
				printf("divisible by 3 but not by 5");
			else 
				if(no%3!=0 && no%5==0) 
					printf("divisible not by 3 but divisible by 5");
					else
		printf("divisible by none");
}