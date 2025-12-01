#include<stdio.h>
struct Employee 
{
 int id;
 char name[30];
 int salary;
};
void main()
{
	struct Employee id1, id2;
	printf("Details of Employee 1\n");
	id1.id=5;
	strcpy (id1.name,"pqr");
	id1.salary=25000;
	printf("id=%d\nname=%s\nsalary=%d\n",id1.id,id1.name,id1.salary);
	
	printf("\nDetails of Employee 2\n");
	scanf("%d",&id2.id);
	scanf("%s",id2.name);
	scanf("%d",&id2.salary);
	printf("id=%d\n",id2.id);	
	printf("name=%s\n",id2.name);
	printf("salary=%d\n",id2.salary);
}