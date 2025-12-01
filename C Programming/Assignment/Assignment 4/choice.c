/* Write a menu driven program to take a number for user and perform operations as follows.

Press 1.To check number is even or odd.
2.To check number is prime or not.
3.To check number is pallindrome or not.
4.To check number is positive, negative or zero.
5.To reverse a number.
6.To find sum of digits.*/

#include<stdio.h>
void main()
{
	int no;
	printf("enter the number");
	scanf("%d",&no);
	printf("enter 1------even or odd\n");
	printf("enter 2------prime no or not\n");
	printf("enter 3------pallidrome or not\n");
	printf("enter 4------pasitive or negative or zero\n");
    printf("enter 5------to reverse a number\n");
    printf("enter 6------to find sum a digit\n");

int choice;
printf("enter the choice");
scanf("%d",&choice);
if(choice==1)
{
	
	if(no%2==0)
	{
		printf("no is even");
	}
	else
	{
		printf("no is odd");
	}
}
	else if(choice==2)
	{
	int i=2;
	while(i<no)
	{
		if(no%i==0)
		{
			printf("no is not prime");
			break;
		}
		i++;
		if(i==no)
		{
			printf("no is prime");
		}
	}
}
	else if(choice==3)
	{
	int  r1,r2,r3 , rev;
	int q1,q2;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	if(no==rev)
	{
		printf("it is not pallidrome no");
	}
	else
	{
		printf("it is  pallidrome no");
	}	
	}
	else if(choice==4)
	{
		if(no>0)
		{
		printf("no is positive");
	}
		else
		{
			if(no<0)
				printf("no is negative");
		else
			printf("no is zero");
	 }
	 }
     	else if(choice==5)
	{
	int  r1,r2,r3 , rev;
	int q1,q2;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	  no==rev;
	  {
	 printf("rev no is %d",rev);
	  }
}
    else if(choice==6)
    {
    	int  sum = 0, re;
    	{
    		while (no!= 0) 
			{
        re = no%10 ; 
        sum= sum+re;        
        no= no/10;    
		}
		printf("Sum of the digits: %d\n", sum);
	}
}
}


	




















