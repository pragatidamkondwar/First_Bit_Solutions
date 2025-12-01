#include<stdio.h>
#include<string.h>
struct Date
{
	int date;
	char month[20];
	int year;
};
void main()
{
	struct Date d1,d2;
	d1.date=250825;
	strcpy(d1.month,"Auguest");
	d1.year=2025;
	printf("%d %s %d",d1.date,d1.month,d1.year);
	
	printf("details of date 2");
	scanf("%d",&d2.date);
	scanf("%s",d2.month);
	scanf("%d",&d2.year);
	printf("%d %s %d",d2.date,d2.month,d2.year);
}