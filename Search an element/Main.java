#include<stdio.h>
int main()
{
  int n,m,flag;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d",&m);
  for(i=0;i<n;i++)
  {if(a[i]==m)
  {   flag=1;
   break; 
  }  
    else
    {flag=0;}
  }
  if(flag==0)
    printf("%d is not present in the array",m);
  else
    printf("%d is present in the array",m);
}