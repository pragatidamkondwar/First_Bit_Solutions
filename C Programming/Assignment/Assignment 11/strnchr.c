#include<stdio.h>
#include<string.h>
int mystrnchr(char* s1, char s2 , int n );
void main()
{
	char s1[50];
	char s2;
	int n;
	printf("enter the string");
	scanf("%s",s1);

	printf("enter the character\n");
	scanf("%c",&s2);

	printf("enter the number");
	scanf("%d",&n);
	
	if(mystrnchr (s1 ,s2 ,n))
	printf("character found");
	else
	printf("character not found");
}
int mystrnchr(char* s1 , char s2, int n)
{
	int i=0;
	while(i<n && s1[i]!='\0')
	{
		if(s1[i]==s2)
		return 1;
		
		i++;
	}
	return 0;
}