#include<stdio.h>
int main()
{
int m;
  scanf("%d",&m); int a[m],b[m],i;
  for(i=0;i<m;i++)
    scanf("%d",&a[i]);
  for(i=0;i<m;i++)
    scanf("%d",&b[i]);
  for(i=0;i<m;i++)
    printf("%d ",a[i]+b[i]);
}