#include<stdio.h>
void mark();//function decleration
void main()
{
	mark();//function call
}
//main function end here
void mark()//function defination 
{
		int marks=77;
	if(marks>75)
		printf("Distinction");
	else
		if(marks>65)
			printf("first class");
		else
			if(marks>55)
				printf("Second class");			
			else
				if(marks>=40)				
					printf("pass");
				else
					printf("fail");
				
}