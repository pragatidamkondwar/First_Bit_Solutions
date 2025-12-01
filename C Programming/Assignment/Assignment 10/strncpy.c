#include<stdio.h>
#include<string.h>
void main()
{
	char a[6]="hello";
	char b[6];
	strncpy(b,a,2);
	printf("b=%s",b);
}