#include<stdio.h>
int main()
{
  int n,a[20],c=0,c1=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    if(a[i]%2==0)
      c++;
    else
      c1++;
  }
  printf("Odd: %d\n",c1);
  printf("Even: %d\n",c);
}