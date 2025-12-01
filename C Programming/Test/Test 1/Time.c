#include<stdio.h>
void main()
{
	int hh,min,sec,T_sec;
	printf("Enter the hour,min,sec");
	scanf("%d %d %d",&hh,&min,&sec);
	T_sec=(hh*3600)+(min*60)+sec;
	printf("%d",T_sec);
}