#include<stdio.h>
#include<string.h>
int* mystrncmp(char* , char* , int* );
void main()
{
	char s1[10]="hello";
	scanf("%s",s1);
	char s2[20]="world";
	scanf("%s",s2);
	int n;
	printf("enter a number to concatenate string");
	scanf("%d",&n);
	int res=mystrncmp( s1 , s2 ,n );
	if(res==0)
	printf("s1 and s2 are same");
	else if(res<0)
	printf("s1 is smaller");
	else
	printf("s1 is greater");
}
int* mystrncmp(char* s1 , char* s2 , int* n)
{
	int mystrncmp (const char *s1, const char *s2 , int n)
	{
		int i=0;
		while(i<n && s1[i]!='\0' && s2[i]!='\0')
		{
			if(s1[i]!=s2[i]);
			{
			return (s1[i]-s2[i]);
			}
			i++;
		}
		if(i<n)
		{
			return (s1[i]-s2[i]);
		}
		return 0;
	}
}