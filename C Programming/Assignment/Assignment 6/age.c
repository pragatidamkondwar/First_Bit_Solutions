#include<stdio.h>
void child();//function decleration
void teenager();
void adult();
void senior();
void main()
{
	child();//function call
	teenager();
	adult();
	senior();
}
//main function end here
void child() //function defination
{
	int age=10;
	if(age<12)
		printf("child");
		printf("\n");
}
void teenager()//function defination
{
	int age=15;
	if(age>=12 && age<19)
			printf("teenager");
			printf("\n");
}
void adult()
{
	int age=22;
		if(age>=20 && age<=59)
              printf("Adult");
			  printf("\n");	
}
void senior()
{
	    int age= 65;
		      printf("senior");	
}