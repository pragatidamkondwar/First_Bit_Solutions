#include<stdio.h>
#include<string.h>
void main()
{
	char a[6]="hello";
	char b[6];
	strcpy(b,a);
	printf("b=%s",b);
}