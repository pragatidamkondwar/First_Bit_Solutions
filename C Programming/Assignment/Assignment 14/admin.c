struct Admin
{
	int id;
	char name[20];
	int salary;
	int allowance;
};
void main()
{
	struct Admin id1, id2;
	id1.id=6;
	strcpy(id1.name,"cpt");
	id1.salary=30000;
	id1.allowance=5000;
	printf("%d %s %d %d\n",id1.id,id1.name,id1.salary,id1.allowance);
	
	printf("details of admin 2");
	scanf("%d",&id2.id);
	scanf("%s",id2.name);
	scanf("%d",&id2.salary);
	scanf("%d",&id2.allowance);
	printf("%d %s %d %d",id2.id,id2.name,id2.salary,id2.allowance);
}
