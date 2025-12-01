#include<stdio.h>
void main()
{
    int arr[5] = {1, 2, 3, 4, 5};
    int key, i, index = -1;

    printf("Enter number to search: ");
    scanf("%d", &key);

    for(i = 0; i < 5; i++)
    {
        if(arr[i] == key)   
        {
            index = i;
            break;   
        }
    }

    if(index != -1)
        printf("Found %d at index %d\n", key, index);
    else
        printf("Not found\n");
}