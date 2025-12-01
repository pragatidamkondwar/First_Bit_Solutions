#include<stdio.h>
#include<string.h>
void main(){
char str1[10], str2[10];
int i;
int  len1=0,len2=0;

printf("enter the string");
fgets(str1,sizeof(str1),stdin);
printf("enter the string");
fgets(str2,sizeof(str2),stdin);
for(i=0; str1[i]='\0';i++)
{
	if(str1[i]!='\n')
	len1++;
}
for(i=0;str2[i]='\0';i++)
{
	if(str2[i]!='\n')
	len2++;
}
printf("length of the first string");
scanf("%d",&len1);
printf("length of the second string");
scanf("%d",&len2);

if(len1>len2){
printf("large string is %s\n",str1);
}else if(len1<len2){
printf("large string is %s",str2);
}else{
printf("both string are");}

}
