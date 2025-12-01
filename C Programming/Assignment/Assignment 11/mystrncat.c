#include<stdio.h>
#include<string.h>
char* mystrncat(char* , char* , int*);
void main()
{
	char s1[10]="hello";
	printf("%s",s1);
	char s2[10]="world";
	printf("%s\n",s2);
	int n;
	printf("enter a number to concatenate string");
	scanf("%d",&n);
	char* p=mystrncat(s1,s2,n);
	printf("After concatenate string %s",p);
}
char* mystrncat(char* s1,char* s2, int* n)
{
	int i=0, j=0;
	while(s1[i]!='\0')
	{
		i++;
	}
	while(j<n && s2[j]!='\0')
	{
		s1[i]=s2[j];
		i++;
		j++;
	}
	s1[i]='\0';
	
	return s1;
}
