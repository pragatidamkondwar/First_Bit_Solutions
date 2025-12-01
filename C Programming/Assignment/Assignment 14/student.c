#include<stdio.h>
struct student 
{
	int rollno;
	char name[20];
	int marks;
};
void main()
{
	struct student s1,s2;
	s1.rollno=101;
	strcpy(s1.name,"xyz");
	s1.marks=75;
	printf("rollno=%d\n",s1.rollno);
	printf("name=%s\n",s1.name);
	printf("marks=%d\n",s1.marks);
	
	
  printf("enter the details of student 2\n");
  scanf("%d",&s2.rollno);
  scanf("%s",s2.name);
  scanf("%d",&s2.marks);
  printf("rollno%d,name=%s,marks=%d",s2.rollno,s2.name,s2.marks);
 
}