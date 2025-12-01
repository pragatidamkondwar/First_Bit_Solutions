#include<stdio.h>
#include<string.h>
void main()
{
	char a[10];
	int n=5;
	sprintf(a,"the value %d",n);
	printf("%s",a);
}