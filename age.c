void main()
{
	int age=10;
	if(age<12)
	{
		printf("child");
	}
	else
	{
		if(age>=12 && age<19)
		{
			printf("teenager");
		}
		else
		{
			if(age>=20 && age<=59)
			{
              printf("Adult");				
			}
			else
			{
				printf("Senior");
			}
		}
	}
}