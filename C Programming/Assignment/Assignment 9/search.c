#include<stdio.h>
int search(int*, int, int);
void main()
{
    int arr[5] = {1, 2, 3, 4, 5};
    int key, index;

    printf("Enter number to search: ");
    scanf("%d", &key);

    index = search(arr, 5, key); 

    if(index != -1)
        printf("Found at index %d\n", index);
    else
        printf("Not found\n");
}
int search(int *ptr, int size, int key)
{
    int i;
    for(i = 0; i < size; i++)
    {
        if(*(ptr + i) == key)   
        {
            return i;   
        }
    }
    return -1;
}