#include<stdio.h>
#include<string.h>
char* mystrcat(char*, char*);
void main()
{
    char str1[20]="hello";
	char str2[]="world"; 
char* p=mystrcat(str1,str2);//call
	printf("%s",p);
}
char* mystrcat(char* des, char*src)//def
{
	int i=0, j=0;
	 while(des[i]!='\0')
	 {	
	   i++;	
    }
    while(src[j]!='\0')
    {
    	des[i]=src[j];
    	i++;
    	j++;
	}
des[i]='\0';
return des;
}
