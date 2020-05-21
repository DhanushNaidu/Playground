#include<stdio.h>
int main()
{
  int n,sum=0,arr[20],i;
  scanf("%d", &n);

    for(i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }

    for(i=0; i<n; i++)
    {
        sum = sum + arr[i];
    }


    printf("%d", sum);
}