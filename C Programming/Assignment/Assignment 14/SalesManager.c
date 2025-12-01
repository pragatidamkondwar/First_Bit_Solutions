#include<stdio.h>
#include<string.h>
struct SalesManager 
{
	int id;
	char name[10];
	int salary;
	int incentive;
	int target;
};
void main()
{
	struct SalesManager sm1,sm2;
	sm1.id=105;
	strcpy(sm1.name,"abc");
	sm1.salary=50000;
	sm1.incentive=10000;
	sm1.target=5;
	printf("id=%d name=%s salary=%d incentive=%d target=%d",sm1.id,sm1.name,sm1.salary,sm1.incentive,sm1.target);
	
	printf("Enter the details of SalesManager 2");
	scanf("%d",&sm2.id);
	scanf("%s",sm2.name);
	scanf("%d",&sm2.salary);
	scanf("%d",&sm2.incentive);
	scanf("%d",&sm2.target);
	printf("id=%d name=%s salary=%d incentive=%d target=%d",sm2.id,sm2.name,sm2.salary,sm2.incentive,sm2.target);
}