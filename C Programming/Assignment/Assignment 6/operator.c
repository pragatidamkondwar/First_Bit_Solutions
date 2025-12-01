#include<stdio.h>
//function decleration
void add();
void sub();
void mul();
void Div();
void mode();
void main() {
//function call
	add();
	sub();
	mul();
	Div();
	mode();
}
//main function end here
//function definition
void add() {
	int no1= 10, no2=20, sum;
	char operator='+';
	if(operator=='+') {
		sum=no1+no2;
		printf("addition%d",sum);
		printf("\n");
	}
}
	void sub() {
		int no1= 10, no2=20, sum;
		char operator='-';
		if(operator=='-') {
			sum=no1-no2;
			printf("subtraction%d",sum);
			printf("\n");

		}
}
void mul()
{
		int no1= 10, no2=20, sum;
     	char operator='*';
	
			if(operator=='*')
			{
				sum=no1*no2;
				printf("Multiplication%d",sum);
				printf("\n");
			}
}
void Div()
{
	int no1= 10, no2=20, sum;
     	char operator='/';
     	
				if(operator=='/')
				{
					sum=no1/no2;
					printf("Division%d",sum);
					printf("\n");
				}
}
void mode()
{
	
		int no1= 10, no2=20, sum;
     	char operator='%';
		
					if(operator=='%')
					{
						sum=no1%no2;
						printf("Mode%d",sum);
					}
				
}

