#include<stdio.h>
#include<stdlib.h>
void mystrdup(int*,int);//decleration
void main()
{
		int arr[5];
		printf("Enter the number");
		for(int i=0;i<5;i++)
	     scanf("%d",&arr[5]);
		 mystrdup(arr,5);// call
		 
}// main end here
 void mystrdup(int* ptr,int size)//defination
{
	int* dup=(int*) malloc(sizeof(int)*size);//malloc
	{ 
	int a=2;
	while(a<ptr[5])
	{
		a++;
		if(a==ptr[5])
		{
			printf("no is prime\n");
		}
		a++;
	}
  }
}