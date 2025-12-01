#include<stdio.h>
#include<string.h>
int mystrlen(char*);//decleration
void main()
{
	char p[]="hello";
	int res=mystrlen(p);//call
	printf("%d",res);	
}
// main end here
int mystrlen(char* d)//defination
{
	int i=0;
	while(d[i]!='\0')
	{
	i++;
}
return i;
}
	