#include<stdio.h>
#include<string.h>
void main()
{
	char str[50];
	char s , a;
	int i;
	printf("enter the string");
	 fgets(str,sizeof(str),stdin);
	 
    printf("enter replace character\n");
	scanf("%c",&a);
	
	printf("enter the special symbol");
	scanf(" %c",&s);
	
	
	for(i=0; str[i]!='\0';i++)
	{
		if(str[i]==a)
		{
			str[i]= s ;
		}
	}
		printf("%s",str);

}