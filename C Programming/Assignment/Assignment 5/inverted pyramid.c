#include<stdio.h>
void main()
{ 
    int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<1*i;j++)
		{
			printf(" ");
		}
		for(int k=0; k<1*(n-i);k++)
		{
			printf("*");
		}
		printf("\n");
	}
}