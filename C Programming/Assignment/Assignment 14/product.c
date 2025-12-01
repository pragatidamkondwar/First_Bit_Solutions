#include<stdio.h>
#include<string.h>
struct product
{
	int id;
	char name[20];
	int quantity;
	int price;
};
void main()
{
	struct product p1,p2;
	p1.id=101;
	strcpy(p1.name,"LED");
	p1.quantity=5;
	p1.price=5000;
	printf("id=%d name=%s quantity=%d price=%d",p1.id,p1.name,p1.quantity,p1.price);
	
	printf ("enter the details of product 2");
	scanf("%d",&p2.id);
	scanf("%s",p2.name);
	scanf("%d",&p2.quantity);
	scanf("%d",&p2.price);
	printf("id=%d name=%s quantity=%d price=%d",p2.id,p2.name,p2.quantity,p2.price);
	
}