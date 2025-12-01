#include<stdio.h>
#include<string.h>
void main()
{
	char p[6]="hello";
	char q[6]="world";
	strncat(p,q,2,);
	printf("%s",p);
}
