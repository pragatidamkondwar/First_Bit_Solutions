#include<stdio.h>
struct HR
{
	int id;
	char name[20];
	int salary;
	double commission;
};
void main()
{
	struct HR hr1,hr2;
	hr1.id=1;
	strcpy(hr1.name,"abc");
	hr1.salary= 25000;
	hr1.commission=5;
	printf("%d %s %d %lf",hr1.id,hr1.name,hr1.salary,hr1.commission);
    
    printf("enter the details of HR2");
    scanf("%d",&hr2.id);
    scanf("%s",hr2.name);
    scanf("%d",&hr2.salary);
    scanf("%lf",&hr2.commission);
    printf("id=%d name=%s salary=%d commission=%lf",hr2.id,hr2.name,hr2.salary,hr2.commission);
}